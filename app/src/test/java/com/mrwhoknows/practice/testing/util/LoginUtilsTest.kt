package com.mrwhoknows.practice.testing.util

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class LoginUtilsTest {

    @Test
    fun `empty email returns false`() {
        assertThat(
            LoginUtils.isValidUser(
                "",
                "123456",
                "123456"
            )
        ).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        assertThat(
            LoginUtils.isValidUser(
                "mail@email.com",
                "",
                "123456"
            )
        ).isFalse()
    }

    @Test
    fun `empty confirmed password returns false`() {
        assertThat(
            LoginUtils.isValidUser(
                "mail@email.com",
                "123456",
                ""
            )
        ).isFalse()
    }

    @Test
    fun `unmatched password returns false`() {
        assertThat(
            LoginUtils.isValidUser(
                "mail@email.com",
                "123456",
                "12233"
            )
        ).isFalse()
    }

    @Test
    fun `matched password returns true`() {
        assertThat(
            LoginUtils.isValidUser(
                "mail@email.com",
                "123456",
                "123456"
            )
        ).isTrue()
    }
}