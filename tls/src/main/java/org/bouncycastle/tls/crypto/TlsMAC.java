package org.bouncycastle.tls.crypto;

/**
 * Interface for MAC services.
 */
public interface TlsMAC
{
    /**
     * Set the key to be used by the MAC implementation supporting this service.
     *
     * @param key the MAC key.
     */
    void setKey(byte[] key);

    /**
     * Update the MAC with the passed in input.
     *
     * @param input input array containing the data.
     * @param inOff offset into the input array the input starts at.
     * @param length the length of the input data.
     */
    void update(byte[] input, int inOff, int length);

    /**
     * Return calculated MAC for any input passed in.
     *
     * @return the MAC value.
     */
    byte[] calculateMAC();

    /**
     * Return the length of the MAC generated by this service.
     *
     * @return the MAC length.
     */
    int getMacLength();

    /**
     * Reset the MAC underlying this service.
     */
    void reset();
}
