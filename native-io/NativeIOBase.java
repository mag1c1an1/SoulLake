public class NativeIOBase implements AutoCloseable {

    public void setExternalAllocator() {}

    public void addFile() {}

    public void setInferringSchema(boolean enable) {
        // figure it out
    }

    public void setBatchSize(int batchSize) {}

    public void setBufferSize(int bufferSize) {}
}
