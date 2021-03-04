package com.mlindos.projects.rsaid.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class JUnitTest
{
    /**
     * Rigorous Test :-)
     */

    private RsaIdentificationValidator rsaIdentificationValidator;

    @BeforeEach
    public void setUp() throws Exception{
        rsaIdentificationValidator = new RsaIdentificationValidator();
    }

    @Test
    @DisplayName("Ensure that the validateRsaIdentification return TRUE")
    public void validateRsaIdentification(){
        assertEquals(true, rsaIdentificationValidator.validateRsaIdentification("1234567890123"),"Make sure that a valid Identity number is provided in the method.");
    }
}
