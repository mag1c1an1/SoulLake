package top.mag1cian.ashlake.io;

import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.vector.types.pojo.Schema;
import top.mag1cian.ashlake.io.mem.ArrowMemoryUtils;

import java.util.Optional;

/**
 * @author mag1cian
 */
public abstract class NativeIOBase implements AutoCloseable {
  protected Optional<BufferAllocator> allocator;

  public NativeIOBase(String allocatorName) {
    this.allocator =
        Optional.of(
            ArrowMemoryUtils.rootAllocator.newChildAllocator(
                allocatorName, 32 * 1024 * 1024, Long.MAX_VALUE));
  }

  public Optional<BufferAllocator> getAllocator() {
    return this.allocator;
  }

  public void setSchema(Schema schema) {}

  /**
   * You need close VecotrSchemaRoot first
   *
   * @throws Exception
   */
  @Override
  public void close() throws Exception {
    if (this.allocator.isPresent()) {
      var inner = this.allocator.get();
      inner.close();
      this.allocator = Optional.empty();
    }
  }
}
