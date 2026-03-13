package top.mag1cian.ashlake.io;

import jnr.ffi.Pointer;
import org.apache.arrow.vector.types.pojo.Schema;

import java.util.Optional;

/**
 * @author mag1cian
 */
public class NativeIOWriter extends NativeIOBase {

  private static int id = 0;

  private Optional<Pointer> writer = Optional.empty();

  public NativeIOWriter(Schema schema) {
    super("NativeWriter[%d]".formatted(NativeIOWriter.id++));
    super.setSchema(schema);
  }

  @Override
  public void close() throws Exception {
    super.close();
  }
}
