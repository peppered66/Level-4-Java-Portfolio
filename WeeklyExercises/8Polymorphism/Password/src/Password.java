//********************************************************************
//Secret.java       Java Foundations
//
//Represents a secret message that can be encrypted and decrypted.
//********************************************************************

//importing base64 util and standard charsets for encryption and decryption
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Password implements Encryptable
{
private String message;
private boolean encrypted;
//creating byte array for later use
private byte[] password;


//-----------------------------------------------------------------
//  Constructor: Stores the original message and establishes
//  a value for the encryption shift.
//-----------------------------------------------------------------
public Password(String msg)
{
  message = msg;
  encrypted = false;
  
}

//-----------------------------------------------------------------
//  Encrypts the string by converting and storing in a byte array and using base64
//  to convert the byte array.
//-----------------------------------------------------------------
public void encrypt()
{
  if (!encrypted)
  {
	  byte[] password = message.getBytes();
	  message = Base64.getEncoder().encodeToString(password);
      encrypted = true;
  }
}

//-----------------------------------------------------------------
//  Decrypts and returns this secret. This is done by decoding the message and storing
//  this value in the byte array and once again converting the byte array to a string 
//  making sure to use THE STANDARD CHARSET US_ASCII!! to get letters :)
//-----------------------------------------------------------------
public String decrypt()
{
  if (encrypted)
  {
	  password = Base64.getDecoder().decode(message); 
	  message = new String(password, StandardCharsets.US_ASCII);
      encrypted = false;
  }

  return message;
}

//-----------------------------------------------------------------
//  Returns true if this secret is currently encrypted.
//-----------------------------------------------------------------
public boolean isEncrypted()
{
  return encrypted;
}

//-----------------------------------------------------------------
//  Returns this secret (may be encrypted).
//-----------------------------------------------------------------
public String toString()
{
  return message;
}
}