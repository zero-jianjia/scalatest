package org.zero.coders

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, InputStream, OutputStream}
import java.util.zip.GZIPOutputStream

/**
  * Created by jianjia1 on 2016/2/24.
  */
object GZIPUtil {
    private[this] val BUFFER = 2048

    /**
      * 数据压缩
      *
      * @param data
      * @return
      * @throws Exception
      */
    @throws(classOf[Exception])
    def compress(data: Array[Byte]): Array[Byte] = {
        val bais: ByteArrayInputStream = new ByteArrayInputStream(data)
        val baos: ByteArrayOutputStream = new ByteArrayOutputStream
        compress(bais, baos)
        val output: Array[Byte] = baos.toByteArray
        baos.flush
        baos.close
        bais.close
        return output
    }

    /**
      * 数据压缩
      *
      * @param is
      * @param os
      * @throws Exception
      */
    @throws(classOf[Exception])
    private def compress(is: InputStream, os: OutputStream) {
        val gos: GZIPOutputStream = new GZIPOutputStream(os)
        var count: Int = 0
        val data = new Array[Byte](BUFFER)
        while ((({
            count = is.read(data, 0, BUFFER);
            count
        })) != -1) {
            gos.write(data, 0, count)
        }
        gos.finish
        gos.flush
        gos.close
    }
}
