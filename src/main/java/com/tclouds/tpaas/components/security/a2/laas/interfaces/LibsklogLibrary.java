package com.tclouds.tpaas.components.security.a2.laas.interfaces;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
/**
* JNA Wrapper for library <b>libsklog</b><br>
* This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
* a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
* For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
*/
public interface LibsklogLibrary extends Library {
	public static final String JNA_LIBRARY_NAME = "sklog";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(LibsklogLibrary.JNA_LIBRARY_NAME);
	public static final LibsklogLibrary INSTANCE = (LibsklogLibrary)Native.loadLibrary(LibsklogLibrary.JNA_LIBRARY_NAME, LibsklogLibrary.class);
	public static final String SKLOG_LOGFILE_PATH = "/usr/local/var/log/libsklog/";
	public static final long SKLOG_FAILURE = 0;
	public static final long SKLOG_SUCCESS = 1;
	public static final int SKLOG_INT_BUFFER_LENGTH = 10;
	public static final String DUMP_FILENAME = "dump";
	public static final String SKLOG_LOGFILE_EXTENSION = "log";
	/**
	 * Original signature : <code>SKLOG_U_Ctx* SKLOG_U_NewCtx()</code><br>
	 * <i>native declaration : line 28</i>
	 */
	LibsklogLibrary.SKLOG_U_Ctx SKLOG_U_NewCtx();
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_InitCtx(SKLOG_U_Ctx*)</code><br>
	 * <i>native declaration : line 31</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_InitCtx(LibsklogLibrary.SKLOG_U_Ctx ctx);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_FreeCtx(SKLOG_U_Ctx**)</code><br>
	 * <i>native declaration : line 34</i><br>
	 * @deprecated use the safer method {@link #SKLOG_U_FreeCtx(libsklog.LibsklogLibrary.SKLOG_U_Ctx[])} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_FreeCtx(PointerByReference ctx);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_FreeCtx(SKLOG_U_Ctx**)</code><br>
	 * <i>native declaration : line 34</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_FreeCtx(LibsklogLibrary.SKLOG_U_Ctx ctx[]);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_LogEvent(SKLOG_U_Ctx*, SKLOG_DATA_TYPE, char*, unsigned int, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 37</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_LogEvent(libsklog.LibsklogLibrary.SKLOG_U_Ctx, libsklog.LibsklogLibrary.SKLOG_DATA_TYPE, java.nio.ByteBuffer, int, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer)} and {@link #SKLOG_U_LogEvent(libsklog.LibsklogLibrary.SKLOG_U_Ctx, libsklog.LibsklogLibrary.SKLOG_DATA_TYPE, com.sun.jna.Pointer, int, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_LogEvent(LibsklogLibrary.SKLOG_U_Ctx ctx, LibsklogLibrary.SKLOG_DATA_TYPE type, ByteBuffer byteBuffer, int event_len, PointerByReference logentry, IntByReference logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_LogEvent(SKLOG_U_Ctx*, SKLOG_DATA_TYPE, char*, unsigned int, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 37</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_LogEvent(LibsklogLibrary.SKLOG_U_Ctx ctx, LibsklogLibrary.SKLOG_DATA_TYPE type, ByteBuffer event, int event_len, PointerByReference logentry, IntBuffer logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Open(SKLOG_U_Ctx*, char**, unsigned int*, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 42</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_Open(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer)} and {@link #SKLOG_U_Open(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Open(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference le1, IntByReference le1_len, PointerByReference le2, IntByReference le2_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Open(SKLOG_U_Ctx*, char**, unsigned int*, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 42</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Open(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference le1, IntBuffer le1_len, PointerByReference le2, IntBuffer le2_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Open_M0(SKLOG_U_Ctx*, unsigned char**, unsigned int*, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 46</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_Open_M0(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer)} and {@link #SKLOG_U_Open_M0(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Open_M0(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference m0, IntByReference m0_len, PointerByReference logentry, IntByReference logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Open_M0(SKLOG_U_Ctx*, unsigned char**, unsigned int*, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 46</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Open_M0(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference m0, IntBuffer m0_len, PointerByReference logentry, IntBuffer logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Open_M1(SKLOG_U_Ctx*, unsigned char*, unsigned int, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 51</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_Open_M1(libsklog.LibsklogLibrary.SKLOG_U_Ctx, java.nio.ByteBuffer, int, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer)} and {@link #SKLOG_U_Open_M1(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.Pointer, int, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Open_M1(LibsklogLibrary.SKLOG_U_Ctx ctx, Pointer m1, int m1_len, PointerByReference logentry, IntByReference logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Open_M1(SKLOG_U_Ctx*, unsigned char*, unsigned int, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 51</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Open_M1(LibsklogLibrary.SKLOG_U_Ctx ctx, ByteBuffer m1, int m1_len, PointerByReference logentry, IntBuffer logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Close(SKLOG_U_Ctx*, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 56</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_Close(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer)} and {@link #SKLOG_U_Close(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Close(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference logentry, IntByReference logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_Close(SKLOG_U_Ctx*, char**, unsigned int*)</code><br>
	 * <i>native declaration : line 56</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_Close(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference logentry, IntBuffer logentry_len);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_FlushLogfile(SKLOG_U_Ctx*, char*[], unsigned int*)</code><br>
	 * <i>native declaration : line 60</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_FlushLogfile(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, java.nio.IntBuffer)} and {@link #SKLOG_U_FlushLogfile(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_FlushLogfile(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference logs, IntByReference logs_size);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_FlushLogfile(SKLOG_U_Ctx*, char*[], unsigned int*)</code><br>
	 * <i>native declaration : line 60</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_FlushLogfile(LibsklogLibrary.SKLOG_U_Ctx ctx, PointerByReference logs, IntBuffer logs_size);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_DumpLogfile(SKLOG_U_Ctx*, const char*, SKLOG_DUMP_MODE)</code><br>
	 * <i>native declaration : line 64</i><br>
	 * @deprecated use the safer methods {@link #SKLOG_U_DumpLogfile(libsklog.LibsklogLibrary.SKLOG_U_Ctx, java.lang.String, libsklog.LibsklogLibrary.SKLOG_DUMP_MODE)} and {@link #SKLOG_U_DumpLogfile(libsklog.LibsklogLibrary.SKLOG_U_Ctx, com.sun.jna.Pointer, libsklog.LibsklogLibrary.SKLOG_DUMP_MODE)} instead
	 */
	@Deprecated 
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_DumpLogfile(LibsklogLibrary.SKLOG_U_Ctx ctx, Pointer filename, LibsklogLibrary.SKLOG_DUMP_MODE dump_mode);
	/**
	 * Original signature : <code>SKLOG_RETURN SKLOG_U_DumpLogfile(SKLOG_U_Ctx*, const char*, SKLOG_DUMP_MODE)</code><br>
	 * <i>native declaration : line 64</i>
	 */
	LibsklogLibrary.SKLOG_RETURN SKLOG_U_DumpLogfile(LibsklogLibrary.SKLOG_U_Ctx ctx, String filename, LibsklogLibrary.SKLOG_DUMP_MODE dump_mode);
	public static class SKLOG_DUMP_MODE extends PointerType {
		public SKLOG_DUMP_MODE(Pointer address) {
			super(address);
		}
		public SKLOG_DUMP_MODE() {
			super();
		}
	};
	public static class SKLOG_DATA_TYPE extends PointerType {
		public SKLOG_DATA_TYPE(Pointer address) {
			super(address);
		}
		public SKLOG_DATA_TYPE() {
			super();
		}
	};
	public static class SKLOG_U_Ctx extends PointerType {
		public SKLOG_U_Ctx(Pointer address) {
			super(address);
		}
		public SKLOG_U_Ctx() {
			super();
		}
	};
	public static class SKLOG_RETURN extends PointerType {
		public SKLOG_RETURN(Pointer address) {
			super(address);
		}
		public SKLOG_RETURN() {
			super();
		}
	};
}
