ConfigurationBuilder builder = new ConfigurationBuilder();
builder.indexing()
   .storage(FILESYSTEM)
      .path("/temp")
   .writer()
      .commitInterval(2000)
      .setLowLevelTrace(false)
      .maxBufferedEntries(32)
      .queueCount(1)
      .queueSize(10000)
      .ramBufferSize(400)
      .threadPoolSize(2)
   .merge()
      .calibrateByDeletes(true)
      .factor(3).
      .maxDocs(2000)
      .minSize(10)
      .maxSize(20);
   .addIndexedEntities(Book.class);
