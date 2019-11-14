package zipcode;

public class Hamming {

    private String firstStrand;
    private String secondStrand;

    public Hamming(String firstStrand, String secondStrand) {
        if(firstStrand.length() != secondStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.firstStrand = firstStrand;
        this.secondStrand = secondStrand;
    }

    int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < firstStrand.length(); i++) {

            if(firstStrand.charAt(i) != secondStrand.charAt(i)) {
                count++;
            }

        }

        return count;
    }
}
