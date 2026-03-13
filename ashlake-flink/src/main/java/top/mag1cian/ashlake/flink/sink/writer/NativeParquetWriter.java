package top.mag1cian.ashlake.flink.sink.writer;

import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.flink.streaming.api.functions.sink.filesystem.InProgressFileWriter;
import org.apache.flink.table.data.RowData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.mag1cian.ashlake.io.NativeIOWriter;

import java.io.IOException;
import java.util.Optional;

/**
 * @author mag1cian
 */
public class NativeParquetWriter implements InProgressFileWriter<RowData, String> {

  private static final Logger LOG = LoggerFactory.getLogger(NativeParquetWriter.class);

  private VectorSchemaRoot batch;

  private Optional<NativeIOWriter> nativeWriter;

  private void initNativeWriter() {}

  @Override
  public void write(RowData element, long currentTime) throws IOException {}

  @Override
  public InProgressFileRecoverable persist() throws IOException {
    return null;
  }

  @Override
  public PendingFileRecoverable closeForCommit() throws IOException {
    return null;
  }

  @Override
  public void dispose() {}

  @Override
  public String getBucketId() {
    return "";
  }

  @Override
  public long getCreationTime() {
    return 0;
  }

  @Override
  public long getSize() throws IOException {
    return 0;
  }

  @Override
  public long getLastUpdateTime() {
    return 0;
  }
}
