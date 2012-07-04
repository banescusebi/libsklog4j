package com.tclouds.tpaas.components.security.a2.laas;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.commons.codec.binary.Base64;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.tclouds.tpaas.components.security.a2.laas.interfaces.LibsklogLibrary;


public class SklogU 
{
	private LibsklogLibrary.SKLOG_U_Ctx ctx;
	
	//@SuppressWarnings("deprecation")
	public SklogU() {
		LibsklogLibrary.SKLOG_U_Ctx rv = LibsklogLibrary.INSTANCE.SKLOG_U_NewCtx();
		
		if (rv == null) {
			ctx = null;
			return;
		}
		ctx = rv;
		
		LibsklogLibrary.SKLOG_RETURN rv1 = LibsklogLibrary.INSTANCE.SKLOG_U_InitCtx(ctx);
		
		if (Pointer.nativeValue(rv1.getPointer()) == LibsklogLibrary.SKLOG_FAILURE) {
			LibsklogLibrary.INSTANCE.SKLOG_U_FreeCtx(new PointerByReference(ctx.getPointer()));
			ctx = null;
		}
	}
	
	public Object[] openM0() {
		PointerByReference m0 = new PointerByReference();
		IntBuffer m0_len = IntBuffer.allocate(LibsklogLibrary.SKLOG_INT_BUFFER_LENGTH);
		PointerByReference logentry = new PointerByReference();
		IntBuffer logentry_len = IntBuffer.allocate(LibsklogLibrary.SKLOG_INT_BUFFER_LENGTH);
		
		if (ctx == null)
			return null;
		
		LibsklogLibrary.SKLOG_RETURN rv = LibsklogLibrary.INSTANCE.SKLOG_U_Open_M0(ctx, m0, m0_len, logentry, logentry_len);
		
		if (Pointer.nativeValue(rv.getPointer()) == LibsklogLibrary.SKLOG_FAILURE) {
			return null;
		}
		
		String b64 = new String(Base64.encodeBase64(m0.getValue().getByteArray(0, m0_len.get(0))));
		
		byte[] logentryArray = logentry.getValue().getByteArray(0, logentry_len.get(0));
		
		Object[] ret = new Object[]{b64, logentryArray};
		
		return ret;
	}
	
	public byte[] openM1(byte[] m1_msg) {
		byte[] b64 = Base64.encodeBase64(m1_msg);
		ByteBuffer m1 = ByteBuffer.wrap(b64);
		PointerByReference logentry = new PointerByReference();
		IntBuffer logentry_len = IntBuffer.allocate(LibsklogLibrary.SKLOG_INT_BUFFER_LENGTH);
		
		LibsklogLibrary.SKLOG_RETURN rv = LibsklogLibrary.INSTANCE.SKLOG_U_Open_M1(ctx, m1, b64.length, logentry, logentry_len);
		
		if (Pointer.nativeValue(rv.getPointer()) == LibsklogLibrary.SKLOG_FAILURE) {
			return null;
		}
		
		byte[] logentryArray = logentry.getValue().getByteArray(0, logentry_len.get(0));
		
		return logentryArray;
	}
	
	public byte[] logEvent(byte[] event) {
		PointerByReference logentry = new PointerByReference();
		IntByReference logentry_len = new IntByReference();
		logentry_len.setValue(event.length);
		Pointer typePtr = new Memory(Native.POINTER_SIZE);
		typePtr.setShort(0, (short) 4);
		LibsklogLibrary.SKLOG_DATA_TYPE type = new LibsklogLibrary.SKLOG_DATA_TYPE(typePtr); 
		
		LibsklogLibrary.SKLOG_RETURN rv = LibsklogLibrary.INSTANCE.SKLOG_U_LogEvent(ctx, type, ByteBuffer.wrap(event), event.length, logentry, logentry_len);
		long rvi = Pointer.nativeValue(rv.getPointer());
		if (rvi == LibsklogLibrary.SKLOG_FAILURE) {
			return null;
		}
		
		ByteBuffer logentryArray = copyBytesFromPointerRef(logentry);
		
		return logentryArray.array();
	}

	private ByteBuffer copyBytesFromPointerRef(PointerByReference logentry) {
		int buffSizeIncrement = 500;
		ByteBuffer logentryArray = ByteBuffer.allocate(buffSizeIncrement);
		int i = 0;
		byte b = 0;
		do {
			b = logentry.getValue().getByte(i++);
			try {
				logentryArray  = logentryArray.put(b);
			} catch (BufferOverflowException e) {
				ByteBuffer newLogentryArray = ByteBuffer.allocate(logentryArray.capacity()+buffSizeIncrement);
				logentryArray.rewind();
				newLogentryArray.put(logentryArray);
				logentryArray = newLogentryArray;
				logentryArray  = logentryArray.put(b);
			}
		} while (b != 0) ;
		return logentryArray;
	}
	
	public byte[] close() {
		PointerByReference logentry = new PointerByReference();
		IntBuffer logentry_len = IntBuffer.allocate(LibsklogLibrary.SKLOG_INT_BUFFER_LENGTH);
		
		LibsklogLibrary.SKLOG_RETURN rv = LibsklogLibrary.INSTANCE.SKLOG_U_Close(ctx, logentry, logentry_len);
		
		if (Pointer.nativeValue(rv.getPointer()) == LibsklogLibrary.SKLOG_FAILURE) {
			return null;
		}
		
		byte[] logentryArray = logentry.getValue().getByteArray(0, logentry_len.get(0));
		
		return logentryArray;
	}
	
	public boolean dumpLogfile(String filename, int dumpMode){
		Pointer dumpModePtr = Pointer.createConstant(dumpMode);
		LibsklogLibrary.SKLOG_DUMP_MODE dump_mode = new LibsklogLibrary.SKLOG_DUMP_MODE(dumpModePtr);
		
		LibsklogLibrary.SKLOG_RETURN rv = LibsklogLibrary.INSTANCE.SKLOG_U_DumpLogfile(ctx, 
				LibsklogLibrary.DUMP_FILENAME, dump_mode);
		
		
		if (Pointer.nativeValue(rv.getPointer()) == LibsklogLibrary.SKLOG_FAILURE) {
			return false;
		}
	
		return true;
	}

}