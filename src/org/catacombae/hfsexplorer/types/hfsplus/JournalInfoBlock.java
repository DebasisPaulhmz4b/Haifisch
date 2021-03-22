/*-
 * Copyright (C) 2007 Erik Larsson
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.hfsexplorer.types.hfsplus;

import org.catacombae.hfsexplorer.Util;

import java.io.PrintStream;

/** This class was generated by CStructToJavaClass. */
public class JournalInfoBlock {
    public static final int kJIJournalInFSMask          = 0x00000001;
    public static final int kJIJournalOnOtherDeviceMask = 0x00000002;
    public static final int kJIJournalNeedInitMask      = 0x00000004;

    /*
     * struct JournalInfoBlock
     * size: 180 bytes
     * description: 
     * 
     * BP  Size  Type        Identifier        Description
     * ---------------------------------------------------
     * 0   4     UInt32      flags                        
     * 4   4*8   UInt32[8]   deviceSignature             
     * 36  8     UInt64      offset                       
     * 44  8     UInt64      size                         
     * 52  4*32  UInt32[32]  reserved                     
     */
    
    private final byte[] flags = new byte[4];
    private final byte[] deviceSignature = new byte[4*8];
    private final byte[] offset = new byte[8];
    private final byte[] size = new byte[8];
    private final byte[] reserved = new byte[4*32];
    
    public JournalInfoBlock(byte[] data, int offset) {
	//System.err.println("JournalInfoBlock. data.length=" + data.length);
	System.arraycopy(data, offset+0, flags, 0, 4);
	System.arraycopy(data, offset+4, deviceSignature, 0, 4*8);
	System.arraycopy(data, offset+36, this.offset, 0, 8);
	System.arraycopy(data, offset+44, size, 0, 8);
	System.arraycopy(data, offset+52, reserved, 0, 4*32);
    }
    
    public static int length() { return 180; }
    
    public int getFlags() { return Util.readIntBE(flags); }
    public int[] getDeviceSignature() { return Util.readIntArrayBE(deviceSignature); }
    public long getOffset() { return Util.readLongBE(offset); }
    public long getSize() { return Util.readLongBE(size); }
    public int[] getReserved() { return Util.readIntArrayBE(reserved); }
    
    public static int getStructSize() { return 180; }
    
    public void printFields(PrintStream ps, String prefix) {
	ps.println(prefix + " flags: " + getFlags());
	ps.println(prefix + " deviceSignature: " + getDeviceSignature());
	ps.println(prefix + " offset: " + getOffset());
	ps.println(prefix + " size: " + getSize());
	ps.println(prefix + " reserved: " + getReserved());
    }
    
    public void print(PrintStream ps, String prefix) {
	ps.println(prefix + "JournalInfoBlock:");
	printFields(ps, prefix);
    }
}
