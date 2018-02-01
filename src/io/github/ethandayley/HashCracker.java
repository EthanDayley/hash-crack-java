package io.github.ethandayley;

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