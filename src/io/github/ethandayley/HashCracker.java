package io.github.ethandayley;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Class to crack a variety of hashes.
 * Final version should have support for multithreading.
 *
 * @author Ethan Dayley
 * @version 0.0
 */
public class HashCracker {
    //////////////////////////
    // INSTANCE VARIABLE DECLARATIONS
    //////////////////////////
    private byte[] inputHash;

    //////////////////////////
    // METHODS ONLY BELOW THIS LINE
    //////////////////////////

    /**
     * Method to get the hash of a given input string,
     * and a hashing algorithm.
     *
     * @param input The string to hash
     * @param hashType The hashing algorithm to use
     * @return The byte array representation of the hash of the input
     */
    private byte[] getHash(String input, String hashType) {
        MessageDigest hasher;
        try {
            hasher = MessageDigest.getInstance(hashType);
            hasher.update(input.getBytes());
            return hasher.digest();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("hashType \""+hashType +"\" unsupported in HashCracker.getHash");
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
    /**
     * Method to crack the given hash.
     * As of this version, it only cracks SHA1.
     *
     * @return The plaintext of the cracked hash.
     */
    public String crack() {
        return "";
    }

    /**
     * Method to set the input hash of the HashCracker.
     *
     * @param {String} inputHashString The hash that will be cracked
     */
    public void setInputHash(String inputHashString) {
        inputHash = inputHashString.getBytes();
    }

    /**
     * Constructor.
     * Hash must be initialized with method setInputHash
     * before you can crack the hash.  Seems kinda obvious,
     * but sometimes I forget stuff like that around 2 am.
     */
    public HashCracker() {
    }

    /**
     * Constructor.
     * Initializes input hash
     *
     * @param {String} inputHashString The hash that will be cracked
     */
    public HashCracker(String inputHashString) {
        setInputHash(inputHashString);
    }
}