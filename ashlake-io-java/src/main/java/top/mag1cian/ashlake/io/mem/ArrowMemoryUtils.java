package top.mag1cian.ashlake.io.mem;

import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.memory.RootAllocator;

/**
 * @author mag1cian
 */
public class ArrowMemoryUtils {
  public static final BufferAllocator rootAllocator = new RootAllocator();

  static {
    Runtime.getRuntime().addShutdownHook(new Thread(rootAllocator::close));
  }
}
