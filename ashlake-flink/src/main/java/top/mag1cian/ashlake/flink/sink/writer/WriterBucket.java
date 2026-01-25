package top.mag1cian.ashlake.flink.sink.writer;

import org.apache.flink.streaming.api.functions.sink.filesystem.InProgressFileWriter;
import org.apache.flink.table.data.RowData;

import java.util.Optional;

/**
 * A bucket is the directory orgranization of the output of the
 *
 * @author mag1cian
 */
public class WriterBucket {

  private Optional<InProgressFileWriter<RowData, String>> inProgressFileWriter;

  void write(RowData element, long currentTime, long tsMs) {}
}
