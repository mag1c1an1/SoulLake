package top.mag1cian.ashlake.io.jnr;

import jnr.ffi.LibraryLoader;

import java.util.Optional;

/**
 * @author mag1cian
 */
public class JnrLoader {
  public static final JnrLoader INSTANCE = new JnrLoader();

  private Optional<LibAshLakeIO> libAshLakeIO = Optional.empty();

  public static synchronized void load() {
    String finalPath = "";
    LibraryLoader.loadLibrary(LibAshLakeIO.class, null, finalPath);
  }
}
