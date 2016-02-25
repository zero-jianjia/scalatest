package org.zero.coders

import java.io.ByteArrayOutputStream

import org.xerial.snappy.{Snappy, SnappyOutputStream}

/**
  * Created by Inuyasha on 16/02/25.
  */
object SnappyUtil {
    def compress(data: Array[Byte]): Array[Byte] = {

        val compressedBytes = Snappy.compress(data)

//        val baos = new ByteArrayOutputStream(1 << 15)
//        val snappy = new SnappyOutputStream( baos, 65536 )

        //        val baos = new ByteArrayOutputStream(1 << 15)
        //
        //        new LZ4BlockOutputStream( baos, 64 * 1024, compressor )



        return compressedBytes
    }
}
