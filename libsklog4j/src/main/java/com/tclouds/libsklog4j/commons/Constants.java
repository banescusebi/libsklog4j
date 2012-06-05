package com.tclouds.libsklog4j.commons;

public interface Constants {
        /*--------------------------------------------------------------------*/
        /*                         common defines                             */
        /*--------------------------------------------------------------------*/

        public static final int     SHA1_LEN                  = 20;
        public static final int     SHA256_LEN                = 32;
        public static final int     UUID_LEN                  = 16;
        public static final int     UUID_STR_LEN              = 36;
        public static final int     HOST_NAME_MAX             = 64;
        public static final int     AES_KEYSIZE_256           = 32;
        public static final int     MAX_FILE_PATH_LEN         = 512;
        public static final int     IPADDR_LEN                = 15;
        public static final int     LOGFILE_LIST_SIZE         = 256;
        public static final int     INBUF_LEN                 = 64;

        public static final int         BUF_512                 = 512;
        public static final int         BUF_1024                = 1024;
        public static final int         BUF_2048                = 2048;
        public static final int         BUF_4096                = 4096;
        public static final int         BUF_8192                = 8192;

        public static final int         SKLOG_UUID_STR_LEN                = 32;

        public static final int     SKLOG_BUFFER_LEN          = 5120;
        public static final int     SKLOG_SMALL_BUFFER_LEN    = 1024;
        public static final int     SKLOG_LOG_ID_LEN          = UUID_STR_LEN;

        public static final int     SKLOG_SESSION_KEY_LEN     = SHA256_LEN;
        public static final int     SKLOG_AUTH_KEY_LEN        = SHA256_LEN;
        public static final int     SKLOG_ENC_KEY_LEN         = SHA256_LEN;
        public static final int     SKLOG_HASH_CHAIN_LEN      = SHA256_LEN;
        public static final int     SKLOG_HMAC_LEN            = SHA256_LEN;

        public static final boolean     SKLOG_SUCCESS             = true;
        public static final boolean     SKLOG_FAILURE             = !SKLOG_SUCCESS;
        public static final boolean     SKLOG_TO_IMPLEMENT        = SKLOG_SUCCESS;
        public static final int     SKLOG_MANUAL              = 1;

        public static final int         SKLOG_VERIFICATION_FAILURE      = -1;

        public static final boolean     DO_VERIFY                 = true;
        public static final boolean     DO_NOT_VERIFY             = !DO_VERIFY;

        //public static final int               SKLOG_TESTS_PATH                  = TESTS_PREFIX;

        public static final int         SKLOG_SETTING_VALUE_LEN         = 512;

        public static final int         ASCII_TIME_STR_LEN                      = 64;
        public static final String              STR_FORMAT_TIME                         = "%Y-%m-%d %H:%M:%S";

        public static final int         SKLOG_SESSION_TO_RENEW          = 2;

        /*
         * dump modes
         * 
         */
         
        public static final int DUMP_MODE_RAW   = 0; 
        public static final int DUMP_MODE_JSON  = 1;
        public static final int DUMP_MODE_SOAP  = 2;
}
