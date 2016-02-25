package org.zero.coders

import java.io.ByteArrayOutputStream

import net.jpountz.lz4.{LZ4BlockOutputStream, LZ4Factory}

/**
  * Created by Inuyasha on 16/02/25.
  */
object LZ4Util {
    val  compressor = LZ4Factory.fastestJavaInstance().fastCompressor()


    @throws(classOf[Exception])
    def compress(data: Array[Byte]): Array[Byte] = {

//        val baos = new ByteArrayOutputStream(1 << 15)
//
//        new LZ4BlockOutputStream( baos, 64 * 1024, compressor )



        return compressor.compress(data)
    }
}
