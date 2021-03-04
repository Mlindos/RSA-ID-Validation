package com.mlindos.projects.rsaid.validator;

public class TestIdentityNumber extends RsaIdentificationValidator {

    private static String rsaIdentificationNumber = "1234567890123"; //Test RSA -ID here

    public static void main(String args[]){

        TestIdentityNumber testIdentityNumber = new TestIdentityNumber();

        System.out.println("Identification Number " + rsaIdentificationNumber + " valid = " + testIdentityNumber.validateRsaIdentification(rsaIdentificationNumber));
    }
}
