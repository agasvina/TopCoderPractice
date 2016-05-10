/*
 * IBM Confidential
 *
 * OCO Source Materials
 *
 * © Copyright IBM Corp. 2015, 2016
 *
 * The source code for this program is not published or otherwise
 * divested of its trade secrets, irrespective of what has been
 * deposited with the U.S. Copyright Office.
 */
package tcc04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BadNeighborsTest {

    @Test
    public void maxDonationsTest() {
        int [] d = { 10, 3, 2, 5, 7, 8 };
        assertEquals(BadNeighbors.maxDonations(d), 19);
        int [] d1 = {596, 633, 339, 994, 719, 901, 551, 772, 38, 211, 212, 812, 454, 
                     931, 879, 78, 243, 637, 815, 182, 359, 192, 892, 152, 234, 480, 
                     814, 649, 613, 216};
        assertEquals(BadNeighbors.maxDonations(d1), 9224);
        int [] d2 = {505, 335, 897, 676, 535, 315, 426, 899, 240, 304, 986, 370, 648,
                     816, 572, 737, 818, 349, 916, 778, 689, 785, 872, 909, 562, 172,
                     710, 702, 658, 665, 465, 94, 522, 476, 828, 677, 674};
        assertEquals(BadNeighbors.maxDonations(d2), 12251);
    }
}
