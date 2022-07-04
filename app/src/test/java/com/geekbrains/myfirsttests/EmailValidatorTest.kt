package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_InvalidEmailWrongLangDomainV2_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.ком"))
    }
    @Test
    fun emailValidator_InvalidEmailWrongLangDomainV1_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@домейн.com"))
    }
    @Test
    fun emailValidator_InvalidEmailWrongLangName_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("имя@email.com"))
    }
    @Test
    fun emailValidator_InvalidEmailSpaceBeforeEmail_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail(" name@email.com"))
    }
    @Test
    fun emailValidator_InvalidEmailSpaceInsideDomainV2_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.c om"))
    }
    @Test
    fun emailValidator_InvalidEmailSpaceInsideDomainV1_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@ema il.com"))
    }
    @Test
    fun emailValidator_InvalidEmailSpaceAfterAt_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@ email.com"))
    }
    @Test
    fun emailValidator_InvalidEmailSpaceAfterLogin_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name @email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleAt_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@@email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailNotAt_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("nameemail.com"))
    }

    @Test
    fun emailValidator_InvalidEmailNotFullDomain_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email."))
    }

    @Test
    fun emailValidator_InvalidEmailAbsentDomain_ReturnFalse() {
        assertFalse(EmailValidator.isValidEmail("name@.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}
