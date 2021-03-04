package com.mlindos.projects.rsaid.validator;

public class RsaIdentificationValidator {

    protected final int MODULUS_TYPE = 10;

    protected final int IDENTIFICATION_LENGTH = 13;

    protected final int [] WEIGHTING_VALUES = {1,2,1,2,1,2,1,2,1,2,1,2};  //Weigthing to perform modulus calculations

    protected int CHECK_DIGIT;

    protected boolean validateRsaIdentification(String rsaIdentity){

        boolean validRsaIdentity = false;

        if (rsaIdentity.length() != IDENTIFICATION_LENGTH)
            validRsaIdentity = false;
        else {
            CHECK_DIGIT = Integer.parseInt(rsaIdentity.substring(12));    //Last digit of the ID is the check digit.
            validRsaIdentity = modulusIdentityVerification(convertRsaIdentity(rsaIdentity));
        }
        return validRsaIdentity;
    }

    private int [] convertRsaIdentity(String rsaIdentity){

        int [] identityNumbers = new int[rsaIdentity.length()];

        for (int i = 0; i < rsaIdentity.length(); i ++){
            identityNumbers[i] = Integer.parseInt(String.valueOf(rsaIdentity.charAt(i)));
        }
        return identityNumbers;
    }

    private boolean modulusIdentityVerification(int [] rsaIdentity){

        int sum = 0;

        for(int i = 0; i < (rsaIdentity.length - 1 ); i ++){
            sum += sumDigit(rsaIdentity[i] * WEIGHTING_VALUES[i]);
        }

        if ((sum % MODULUS_TYPE) == CHECK_DIGIT)
            return true;
        else
            if ((MODULUS_TYPE - (sum % MODULUS_TYPE)) == CHECK_DIGIT)
                return true;
            else
                return false;

    }

    private int sumDigit(int sum){
        return ((sum % MODULUS_TYPE) + (sum / MODULUS_TYPE));
    }
}
