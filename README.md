# RSA-ID-Validation
A modulus 11 algorithm to validate South African Identity number.

The last digit of the ID number is the check-digit.
It uses a weightings on the first 12 digit and performs modulus algorithm and the answer is checked against the check-digit. If they are the same, the ID number is deemed valid.

This is a maven project:

The test package can be used to test various id's.

The method validateRsaIdentification(String rsaIdentity) // Validates input ID number. The string has to be 13 digits.
