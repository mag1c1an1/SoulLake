package top.mag1cian.ashlake.flink.arrow;

import org.apache.arrow.memory.RootAllocator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrowWrapperTest {
  @Test
  public void simpleTest() {
    RootAllocator root = new RootAllocator(1024 * 1024 * 1024);
    root.close();
    System.out.println(root.getAllocatedMemory());
  }
}
