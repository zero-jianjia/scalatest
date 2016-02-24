
package com.zero.proto;

public final class IndexSearchData {
  private IndexSearchData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface IndexRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IndexRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    java.util.List<com.zero.proto.IndexSearchData.SearchReq> 
        getSearchList();
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    com.zero.proto.IndexSearchData.SearchReq getSearch(int index);
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    int getSearchCount();
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    java.util.List<? extends com.zero.proto.IndexSearchData.SearchReqOrBuilder> 
        getSearchOrBuilderList();
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    com.zero.proto.IndexSearchData.SearchReqOrBuilder getSearchOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code IndexRequest}
   *
   * <pre>
   ************索引检索请求*************
   * </pre>
   */
  public static final class IndexRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:IndexRequest)
      IndexRequestOrBuilder {
    // Use IndexRequest.newBuilder() to construct.
    private IndexRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private IndexRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final IndexRequest defaultInstance;
    public static IndexRequest getDefaultInstance() {
      return defaultInstance;
    }

    public IndexRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private IndexRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                search_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.SearchReq>();
                mutable_bitField0_ |= 0x00000001;
              }
              search_.add(input.readMessage(com.zero.proto.IndexSearchData.SearchReq.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          search_ = java.util.Collections.unmodifiableList(search_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_IndexRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_IndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zero.proto.IndexSearchData.IndexRequest.class, com.zero.proto.IndexSearchData.IndexRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<IndexRequest> PARSER =
        new com.google.protobuf.AbstractParser<IndexRequest>() {
      public IndexRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IndexRequest(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<IndexRequest> getParserForType() {
      return PARSER;
    }

    public static final int SEARCH_FIELD_NUMBER = 1;
    private java.util.List<com.zero.proto.IndexSearchData.SearchReq> search_;
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    public java.util.List<com.zero.proto.IndexSearchData.SearchReq> getSearchList() {
      return search_;
    }
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    public java.util.List<? extends com.zero.proto.IndexSearchData.SearchReqOrBuilder>
        getSearchOrBuilderList() {
      return search_;
    }
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    public int getSearchCount() {
      return search_.size();
    }
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    public com.zero.proto.IndexSearchData.SearchReq getSearch(int index) {
      return search_.get(index);
    }
    /**
     * <code>repeated .SearchReq search = 1;</code>
     */
    public com.zero.proto.IndexSearchData.SearchReqOrBuilder getSearchOrBuilder(
        int index) {
      return search_.get(index);
    }

    private void initFields() {
      search_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getSearchCount(); i++) {
        if (!getSearch(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < search_.size(); i++) {
        output.writeMessage(1, search_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < search_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, search_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.IndexRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zero.proto.IndexSearchData.IndexRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code IndexRequest}
     *
     * <pre>
     ************索引检索请求*************
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IndexRequest)
        com.zero.proto.IndexSearchData.IndexRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_IndexRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_IndexRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zero.proto.IndexSearchData.IndexRequest.class, com.zero.proto.IndexSearchData.IndexRequest.Builder.class);
      }

      // Construct using com.zero.proto.IndexSearchData.IndexRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSearchFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (searchBuilder_ == null) {
          search_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          searchBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_IndexRequest_descriptor;
      }

      public com.zero.proto.IndexSearchData.IndexRequest getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.zero.proto.IndexSearchData.IndexRequest build() {
        com.zero.proto.IndexSearchData.IndexRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zero.proto.IndexSearchData.IndexRequest buildPartial() {
        com.zero.proto.IndexSearchData.IndexRequest result = new com.zero.proto.IndexSearchData.IndexRequest(this);
        int from_bitField0_ = bitField0_;
        if (searchBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            search_ = java.util.Collections.unmodifiableList(search_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.search_ = search_;
        } else {
          result.search_ = searchBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zero.proto.IndexSearchData.IndexRequest) {
          return mergeFrom((com.zero.proto.IndexSearchData.IndexRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zero.proto.IndexSearchData.IndexRequest other) {
        if (other == getDefaultInstance()) return this;
        if (searchBuilder_ == null) {
          if (!other.search_.isEmpty()) {
            if (search_.isEmpty()) {
              search_ = other.search_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSearchIsMutable();
              search_.addAll(other.search_);
            }
            onChanged();
          }
        } else {
          if (!other.search_.isEmpty()) {
            if (searchBuilder_.isEmpty()) {
              searchBuilder_.dispose();
              searchBuilder_ = null;
              search_ = other.search_;
              bitField0_ = (bitField0_ & ~0x00000001);
              searchBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getSearchFieldBuilder() : null;
            } else {
              searchBuilder_.addAllMessages(other.search_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getSearchCount(); i++) {
          if (!getSearch(i).isInitialized()) {

            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zero.proto.IndexSearchData.IndexRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zero.proto.IndexSearchData.IndexRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.zero.proto.IndexSearchData.SearchReq> search_ =
        java.util.Collections.emptyList();
      private void ensureSearchIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          search_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.SearchReq>(search_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.SearchReq, com.zero.proto.IndexSearchData.SearchReq.Builder, com.zero.proto.IndexSearchData.SearchReqOrBuilder> searchBuilder_;

      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public java.util.List<com.zero.proto.IndexSearchData.SearchReq> getSearchList() {
        if (searchBuilder_ == null) {
          return java.util.Collections.unmodifiableList(search_);
        } else {
          return searchBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public int getSearchCount() {
        if (searchBuilder_ == null) {
          return search_.size();
        } else {
          return searchBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchReq getSearch(int index) {
        if (searchBuilder_ == null) {
          return search_.get(index);
        } else {
          return searchBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder setSearch(
          int index, com.zero.proto.IndexSearchData.SearchReq value) {
        if (searchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSearchIsMutable();
          search_.set(index, value);
          onChanged();
        } else {
          searchBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder setSearch(
          int index, com.zero.proto.IndexSearchData.SearchReq.Builder builderForValue) {
        if (searchBuilder_ == null) {
          ensureSearchIsMutable();
          search_.set(index, builderForValue.build());
          onChanged();
        } else {
          searchBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder addSearch(com.zero.proto.IndexSearchData.SearchReq value) {
        if (searchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSearchIsMutable();
          search_.add(value);
          onChanged();
        } else {
          searchBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder addSearch(
          int index, com.zero.proto.IndexSearchData.SearchReq value) {
        if (searchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSearchIsMutable();
          search_.add(index, value);
          onChanged();
        } else {
          searchBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder addSearch(
          com.zero.proto.IndexSearchData.SearchReq.Builder builderForValue) {
        if (searchBuilder_ == null) {
          ensureSearchIsMutable();
          search_.add(builderForValue.build());
          onChanged();
        } else {
          searchBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder addSearch(
          int index, com.zero.proto.IndexSearchData.SearchReq.Builder builderForValue) {
        if (searchBuilder_ == null) {
          ensureSearchIsMutable();
          search_.add(index, builderForValue.build());
          onChanged();
        } else {
          searchBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder addAllSearch(
          Iterable<? extends com.zero.proto.IndexSearchData.SearchReq> values) {
        if (searchBuilder_ == null) {
          ensureSearchIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, search_);
          onChanged();
        } else {
          searchBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder clearSearch() {
        if (searchBuilder_ == null) {
          search_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          searchBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public Builder removeSearch(int index) {
        if (searchBuilder_ == null) {
          ensureSearchIsMutable();
          search_.remove(index);
          onChanged();
        } else {
          searchBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchReq.Builder getSearchBuilder(
          int index) {
        return getSearchFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchReqOrBuilder getSearchOrBuilder(
          int index) {
        if (searchBuilder_ == null) {
          return search_.get(index);  } else {
          return searchBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public java.util.List<? extends com.zero.proto.IndexSearchData.SearchReqOrBuilder>
           getSearchOrBuilderList() {
        if (searchBuilder_ != null) {
          return searchBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(search_);
        }
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchReq.Builder addSearchBuilder() {
        return getSearchFieldBuilder().addBuilder(
            com.zero.proto.IndexSearchData.SearchReq.getDefaultInstance());
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchReq.Builder addSearchBuilder(
          int index) {
        return getSearchFieldBuilder().addBuilder(
            index, com.zero.proto.IndexSearchData.SearchReq.getDefaultInstance());
      }
      /**
       * <code>repeated .SearchReq search = 1;</code>
       */
      public java.util.List<com.zero.proto.IndexSearchData.SearchReq.Builder>
           getSearchBuilderList() {
        return getSearchFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.SearchReq, com.zero.proto.IndexSearchData.SearchReq.Builder, com.zero.proto.IndexSearchData.SearchReqOrBuilder>
          getSearchFieldBuilder() {
        if (searchBuilder_ == null) {
          searchBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.zero.proto.IndexSearchData.SearchReq, com.zero.proto.IndexSearchData.SearchReq.Builder, com.zero.proto.IndexSearchData.SearchReqOrBuilder>(
                  search_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          search_ = null;
        }
        return searchBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:IndexRequest)
    }

    static {
      defaultInstance = new IndexRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:IndexRequest)
  }

  public interface IndexResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IndexResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    java.util.List<com.zero.proto.IndexSearchData.SearchResp>
        getResultList();
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    com.zero.proto.IndexSearchData.SearchResp getResult(int index);
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    int getResultCount();
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    java.util.List<? extends com.zero.proto.IndexSearchData.SearchRespOrBuilder>
        getResultOrBuilderList();
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    com.zero.proto.IndexSearchData.SearchRespOrBuilder getResultOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code IndexResponse}
   *
   * <pre>
   ************索引检索回复*************
   * </pre>
   */
  public static final class IndexResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:IndexResponse)
      IndexResponseOrBuilder {
    // Use IndexResponse.newBuilder() to construct.
    private IndexResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private IndexResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final IndexResponse defaultInstance;
    public static IndexResponse getDefaultInstance() {
      return defaultInstance;
    }

    public IndexResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private IndexResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                result_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.SearchResp>();
                mutable_bitField0_ |= 0x00000001;
              }
              result_.add(input.readMessage(com.zero.proto.IndexSearchData.SearchResp.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          result_ = java.util.Collections.unmodifiableList(result_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_IndexResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_IndexResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zero.proto.IndexSearchData.IndexResponse.class, com.zero.proto.IndexSearchData.IndexResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<IndexResponse> PARSER =
        new com.google.protobuf.AbstractParser<IndexResponse>() {
      public IndexResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IndexResponse(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<IndexResponse> getParserForType() {
      return PARSER;
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private java.util.List<com.zero.proto.IndexSearchData.SearchResp> result_;
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    public java.util.List<com.zero.proto.IndexSearchData.SearchResp> getResultList() {
      return result_;
    }
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    public java.util.List<? extends com.zero.proto.IndexSearchData.SearchRespOrBuilder>
        getResultOrBuilderList() {
      return result_;
    }
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    public int getResultCount() {
      return result_.size();
    }
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    public com.zero.proto.IndexSearchData.SearchResp getResult(int index) {
      return result_.get(index);
    }
    /**
     * <code>repeated .SearchResp result = 1;</code>
     */
    public com.zero.proto.IndexSearchData.SearchRespOrBuilder getResultOrBuilder(
        int index) {
      return result_.get(index);
    }

    private void initFields() {
      result_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getResultCount(); i++) {
        if (!getResult(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < result_.size(); i++) {
        output.writeMessage(1, result_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < result_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, result_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.IndexResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zero.proto.IndexSearchData.IndexResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code IndexResponse}
     *
     * <pre>
     ************索引检索回复*************
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IndexResponse)
        com.zero.proto.IndexSearchData.IndexResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_IndexResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_IndexResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zero.proto.IndexSearchData.IndexResponse.class, com.zero.proto.IndexSearchData.IndexResponse.Builder.class);
      }

      // Construct using com.zero.proto.IndexSearchData.IndexResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getResultFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (resultBuilder_ == null) {
          result_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          resultBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_IndexResponse_descriptor;
      }

      public com.zero.proto.IndexSearchData.IndexResponse getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.zero.proto.IndexSearchData.IndexResponse build() {
        com.zero.proto.IndexSearchData.IndexResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zero.proto.IndexSearchData.IndexResponse buildPartial() {
        com.zero.proto.IndexSearchData.IndexResponse result = new com.zero.proto.IndexSearchData.IndexResponse(this);
        int from_bitField0_ = bitField0_;
        if (resultBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            result_ = java.util.Collections.unmodifiableList(result_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zero.proto.IndexSearchData.IndexResponse) {
          return mergeFrom((com.zero.proto.IndexSearchData.IndexResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zero.proto.IndexSearchData.IndexResponse other) {
        if (other == getDefaultInstance()) return this;
        if (resultBuilder_ == null) {
          if (!other.result_.isEmpty()) {
            if (result_.isEmpty()) {
              result_ = other.result_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureResultIsMutable();
              result_.addAll(other.result_);
            }
            onChanged();
          }
        } else {
          if (!other.result_.isEmpty()) {
            if (resultBuilder_.isEmpty()) {
              resultBuilder_.dispose();
              resultBuilder_ = null;
              result_ = other.result_;
              bitField0_ = (bitField0_ & ~0x00000001);
              resultBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getResultFieldBuilder() : null;
            } else {
              resultBuilder_.addAllMessages(other.result_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getResultCount(); i++) {
          if (!getResult(i).isInitialized()) {

            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zero.proto.IndexSearchData.IndexResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zero.proto.IndexSearchData.IndexResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.zero.proto.IndexSearchData.SearchResp> result_ =
        java.util.Collections.emptyList();
      private void ensureResultIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          result_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.SearchResp>(result_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.SearchResp, com.zero.proto.IndexSearchData.SearchResp.Builder, com.zero.proto.IndexSearchData.SearchRespOrBuilder> resultBuilder_;

      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public java.util.List<com.zero.proto.IndexSearchData.SearchResp> getResultList() {
        if (resultBuilder_ == null) {
          return java.util.Collections.unmodifiableList(result_);
        } else {
          return resultBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public int getResultCount() {
        if (resultBuilder_ == null) {
          return result_.size();
        } else {
          return resultBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchResp getResult(int index) {
        if (resultBuilder_ == null) {
          return result_.get(index);
        } else {
          return resultBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder setResult(
          int index, com.zero.proto.IndexSearchData.SearchResp value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResultIsMutable();
          result_.set(index, value);
          onChanged();
        } else {
          resultBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder setResult(
          int index, com.zero.proto.IndexSearchData.SearchResp.Builder builderForValue) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.set(index, builderForValue.build());
          onChanged();
        } else {
          resultBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder addResult(com.zero.proto.IndexSearchData.SearchResp value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResultIsMutable();
          result_.add(value);
          onChanged();
        } else {
          resultBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder addResult(
          int index, com.zero.proto.IndexSearchData.SearchResp value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResultIsMutable();
          result_.add(index, value);
          onChanged();
        } else {
          resultBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder addResult(
          com.zero.proto.IndexSearchData.SearchResp.Builder builderForValue) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.add(builderForValue.build());
          onChanged();
        } else {
          resultBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder addResult(
          int index, com.zero.proto.IndexSearchData.SearchResp.Builder builderForValue) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.add(index, builderForValue.build());
          onChanged();
        } else {
          resultBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder addAllResult(
          Iterable<? extends com.zero.proto.IndexSearchData.SearchResp> values) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, result_);
          onChanged();
        } else {
          resultBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          resultBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public Builder removeResult(int index) {
        if (resultBuilder_ == null) {
          ensureResultIsMutable();
          result_.remove(index);
          onChanged();
        } else {
          resultBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchResp.Builder getResultBuilder(
          int index) {
        return getResultFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchRespOrBuilder getResultOrBuilder(
          int index) {
        if (resultBuilder_ == null) {
          return result_.get(index);  } else {
          return resultBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public java.util.List<? extends com.zero.proto.IndexSearchData.SearchRespOrBuilder>
           getResultOrBuilderList() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(result_);
        }
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchResp.Builder addResultBuilder() {
        return getResultFieldBuilder().addBuilder(
            com.zero.proto.IndexSearchData.SearchResp.getDefaultInstance());
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public com.zero.proto.IndexSearchData.SearchResp.Builder addResultBuilder(
          int index) {
        return getResultFieldBuilder().addBuilder(
            index, com.zero.proto.IndexSearchData.SearchResp.getDefaultInstance());
      }
      /**
       * <code>repeated .SearchResp result = 1;</code>
       */
      public java.util.List<com.zero.proto.IndexSearchData.SearchResp.Builder>
           getResultBuilderList() {
        return getResultFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.SearchResp, com.zero.proto.IndexSearchData.SearchResp.Builder, com.zero.proto.IndexSearchData.SearchRespOrBuilder>
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.zero.proto.IndexSearchData.SearchResp, com.zero.proto.IndexSearchData.SearchResp.Builder, com.zero.proto.IndexSearchData.SearchRespOrBuilder>(
                  result_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          result_ = null;
        }
        return resultBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:IndexResponse)
    }

    static {
      defaultInstance = new IndexResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:IndexResponse)
  }

  public interface SearchReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SearchReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string adunitId = 1;</code>
     */
    boolean hasAdunitId();
    /**
     * <code>required string adunitId = 1;</code>
     */
    String getAdunitId();
    /**
     * <code>required string adunitId = 1;</code>
     */
    com.google.protobuf.ByteString
        getAdunitIdBytes();

    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    java.util.List<com.zero.proto.IndexSearchData.Target>
        getTargetsList();
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    com.zero.proto.IndexSearchData.Target getTargets(int index);
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    int getTargetsCount();
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    java.util.List<? extends com.zero.proto.IndexSearchData.TargetOrBuilder>
        getTargetsOrBuilderList();
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    com.zero.proto.IndexSearchData.TargetOrBuilder getTargetsOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code SearchReq}
   *
   * <pre>
   ************投放单的检索请求**********
   * </pre>
   */
  public static final class SearchReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SearchReq)
      SearchReqOrBuilder {
    // Use SearchReq.newBuilder() to construct.
    private SearchReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SearchReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SearchReq defaultInstance;
    public static SearchReq getDefaultInstance() {
      return defaultInstance;
    }

    public SearchReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SearchReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              adunitId_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                targets_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.Target>();
                mutable_bitField0_ |= 0x00000002;
              }
              targets_.add(input.readMessage(com.zero.proto.IndexSearchData.Target.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = java.util.Collections.unmodifiableList(targets_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_SearchReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_SearchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zero.proto.IndexSearchData.SearchReq.class, com.zero.proto.IndexSearchData.SearchReq.Builder.class);
    }

    public static com.google.protobuf.Parser<SearchReq> PARSER =
        new com.google.protobuf.AbstractParser<SearchReq>() {
      public SearchReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SearchReq(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<SearchReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ADUNITID_FIELD_NUMBER = 1;
    private Object adunitId_;
    /**
     * <code>required string adunitId = 1;</code>
     */
    public boolean hasAdunitId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string adunitId = 1;</code>
     */
    public String getAdunitId() {
      Object ref = adunitId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          adunitId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string adunitId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAdunitIdBytes() {
      Object ref = adunitId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        adunitId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGETS_FIELD_NUMBER = 2;
    private java.util.List<com.zero.proto.IndexSearchData.Target> targets_;
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    public java.util.List<com.zero.proto.IndexSearchData.Target> getTargetsList() {
      return targets_;
    }
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    public java.util.List<? extends com.zero.proto.IndexSearchData.TargetOrBuilder>
        getTargetsOrBuilderList() {
      return targets_;
    }
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    public int getTargetsCount() {
      return targets_.size();
    }
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    public com.zero.proto.IndexSearchData.Target getTargets(int index) {
      return targets_.get(index);
    }
    /**
     * <code>repeated .Target targets = 2;</code>
     *
     * <pre>
     *各个维度定向
     * </pre>
     */
    public com.zero.proto.IndexSearchData.TargetOrBuilder getTargetsOrBuilder(
        int index) {
      return targets_.get(index);
    }

    private void initFields() {
      adunitId_ = "";
      targets_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAdunitId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getTargetsCount(); i++) {
        if (!getTargets(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAdunitIdBytes());
      }
      for (int i = 0; i < targets_.size(); i++) {
        output.writeMessage(2, targets_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getAdunitIdBytes());
      }
      for (int i = 0; i < targets_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, targets_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.SearchReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zero.proto.IndexSearchData.SearchReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SearchReq}
     *
     * <pre>
     ************投放单的检索请求**********
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SearchReq)
        com.zero.proto.IndexSearchData.SearchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_SearchReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_SearchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zero.proto.IndexSearchData.SearchReq.class, com.zero.proto.IndexSearchData.SearchReq.Builder.class);
      }

      // Construct using com.zero.proto.IndexSearchData.SearchReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTargetsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        adunitId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_SearchReq_descriptor;
      }

      public com.zero.proto.IndexSearchData.SearchReq getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.zero.proto.IndexSearchData.SearchReq build() {
        com.zero.proto.IndexSearchData.SearchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zero.proto.IndexSearchData.SearchReq buildPartial() {
        com.zero.proto.IndexSearchData.SearchReq result = new com.zero.proto.IndexSearchData.SearchReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.adunitId_ = adunitId_;
        if (targetsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            targets_ = java.util.Collections.unmodifiableList(targets_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.targets_ = targets_;
        } else {
          result.targets_ = targetsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zero.proto.IndexSearchData.SearchReq) {
          return mergeFrom((com.zero.proto.IndexSearchData.SearchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zero.proto.IndexSearchData.SearchReq other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasAdunitId()) {
          bitField0_ |= 0x00000001;
          adunitId_ = other.adunitId_;
          onChanged();
        }
        if (targetsBuilder_ == null) {
          if (!other.targets_.isEmpty()) {
            if (targets_.isEmpty()) {
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTargetsIsMutable();
              targets_.addAll(other.targets_);
            }
            onChanged();
          }
        } else {
          if (!other.targets_.isEmpty()) {
            if (targetsBuilder_.isEmpty()) {
              targetsBuilder_.dispose();
              targetsBuilder_ = null;
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
              targetsBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTargetsFieldBuilder() : null;
            } else {
              targetsBuilder_.addAllMessages(other.targets_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAdunitId()) {

          return false;
        }
        for (int i = 0; i < getTargetsCount(); i++) {
          if (!getTargets(i).isInitialized()) {

            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zero.proto.IndexSearchData.SearchReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zero.proto.IndexSearchData.SearchReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object adunitId_ = "";
      /**
       * <code>required string adunitId = 1;</code>
       */
      public boolean hasAdunitId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public String getAdunitId() {
        Object ref = adunitId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            adunitId_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAdunitIdBytes() {
        Object ref = adunitId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          adunitId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public Builder setAdunitId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        adunitId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public Builder clearAdunitId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        adunitId_ = getDefaultInstance().getAdunitId();
        onChanged();
        return this;
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public Builder setAdunitIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        adunitId_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.zero.proto.IndexSearchData.Target> targets_ =
        java.util.Collections.emptyList();
      private void ensureTargetsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.Target>(targets_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.Target, com.zero.proto.IndexSearchData.Target.Builder, com.zero.proto.IndexSearchData.TargetOrBuilder> targetsBuilder_;

      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public java.util.List<com.zero.proto.IndexSearchData.Target> getTargetsList() {
        if (targetsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(targets_);
        } else {
          return targetsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public int getTargetsCount() {
        if (targetsBuilder_ == null) {
          return targets_.size();
        } else {
          return targetsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public com.zero.proto.IndexSearchData.Target getTargets(int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);
        } else {
          return targetsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder setTargets(
          int index, com.zero.proto.IndexSearchData.Target value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.set(index, value);
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder setTargets(
          int index, com.zero.proto.IndexSearchData.Target.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.set(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder addTargets(com.zero.proto.IndexSearchData.Target value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder addTargets(
          int index, com.zero.proto.IndexSearchData.Target value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(index, value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder addTargets(
          com.zero.proto.IndexSearchData.Target.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder addTargets(
          int index, com.zero.proto.IndexSearchData.Target.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder addAllTargets(
          Iterable<? extends com.zero.proto.IndexSearchData.Target> values) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, targets_);
          onChanged();
        } else {
          targetsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder clearTargets() {
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public Builder removeTargets(int index) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.remove(index);
          onChanged();
        } else {
          targetsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public com.zero.proto.IndexSearchData.Target.Builder getTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public com.zero.proto.IndexSearchData.TargetOrBuilder getTargetsOrBuilder(
          int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);  } else {
          return targetsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public java.util.List<? extends com.zero.proto.IndexSearchData.TargetOrBuilder>
           getTargetsOrBuilderList() {
        if (targetsBuilder_ != null) {
          return targetsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(targets_);
        }
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public com.zero.proto.IndexSearchData.Target.Builder addTargetsBuilder() {
        return getTargetsFieldBuilder().addBuilder(
            com.zero.proto.IndexSearchData.Target.getDefaultInstance());
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public com.zero.proto.IndexSearchData.Target.Builder addTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().addBuilder(
            index, com.zero.proto.IndexSearchData.Target.getDefaultInstance());
      }
      /**
       * <code>repeated .Target targets = 2;</code>
       *
       * <pre>
       *各个维度定向
       * </pre>
       */
      public java.util.List<com.zero.proto.IndexSearchData.Target.Builder>
           getTargetsBuilderList() {
        return getTargetsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.Target, com.zero.proto.IndexSearchData.Target.Builder, com.zero.proto.IndexSearchData.TargetOrBuilder>
          getTargetsFieldBuilder() {
        if (targetsBuilder_ == null) {
          targetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.zero.proto.IndexSearchData.Target, com.zero.proto.IndexSearchData.Target.Builder, com.zero.proto.IndexSearchData.TargetOrBuilder>(
                  targets_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          targets_ = null;
        }
        return targetsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:SearchReq)
    }

    static {
      defaultInstance = new SearchReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SearchReq)
  }

  public interface TargetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Target)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required string type = 1;</code>
     */
    String getType();
    /**
     * <code>required string type = 1;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>required string value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>required string value = 2;</code>
     */
    String getValue();
    /**
     * <code>required string value = 2;</code>
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code Target}
   *
   * <pre>
   *定向内容
   * </pre>
   */
  public static final class Target extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Target)
      TargetOrBuilder {
    // Use Target.newBuilder() to construct.
    private Target(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Target(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Target defaultInstance;
    public static Target getDefaultInstance() {
      return defaultInstance;
    }

    public Target getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Target(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              type_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              value_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_Target_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_Target_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zero.proto.IndexSearchData.Target.class, com.zero.proto.IndexSearchData.Target.Builder.class);
    }

    public static com.google.protobuf.Parser<Target> PARSER =
        new com.google.protobuf.AbstractParser<Target>() {
      public Target parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Target(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<Target> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Object type_;
    /**
     * <code>required string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string type = 1;</code>
     */
    public String getType() {
      Object ref = type_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private Object value_;
    /**
     * <code>required string value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string value = 2;</code>
     */
    public String getValue() {
      Object ref = value_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      type_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zero.proto.IndexSearchData.Target parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.Target parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zero.proto.IndexSearchData.Target parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.Target parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zero.proto.IndexSearchData.Target prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Target}
     *
     * <pre>
     *定向内容
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Target)
        com.zero.proto.IndexSearchData.TargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_Target_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_Target_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zero.proto.IndexSearchData.Target.class, com.zero.proto.IndexSearchData.Target.Builder.class);
      }

      // Construct using com.zero.proto.IndexSearchData.Target.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_Target_descriptor;
      }

      public com.zero.proto.IndexSearchData.Target getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.zero.proto.IndexSearchData.Target build() {
        com.zero.proto.IndexSearchData.Target result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zero.proto.IndexSearchData.Target buildPartial() {
        com.zero.proto.IndexSearchData.Target result = new com.zero.proto.IndexSearchData.Target(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zero.proto.IndexSearchData.Target) {
          return mergeFrom((com.zero.proto.IndexSearchData.Target)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zero.proto.IndexSearchData.Target other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000002;
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {

          return false;
        }
        if (!hasValue()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zero.proto.IndexSearchData.Target parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zero.proto.IndexSearchData.Target) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object type_ = "";
      /**
       * <code>required string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string type = 1;</code>
       */
      public String getType() {
        Object ref = type_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string type = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string type = 1;</code>
       */
      public Builder setType(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 1;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private Object value_ = "";
      /**
       * <code>required string value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string value = 2;</code>
       */
      public String getValue() {
        Object ref = value_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            value_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string value = 2;</code>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string value = 2;</code>
       */
      public Builder setValue(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>required string value = 2;</code>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Target)
    }

    static {
      defaultInstance = new Target(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Target)
  }

  public interface SearchRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SearchResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string adunitId = 1;</code>
     */
    boolean hasAdunitId();
    /**
     * <code>required string adunitId = 1;</code>
     */
    String getAdunitId();
    /**
     * <code>required string adunitId = 1;</code>
     */
    com.google.protobuf.ByteString
        getAdunitIdBytes();

    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    java.util.List<com.zero.proto.IndexSearchData.LineitemResp>
        getLineitemsList();
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    com.zero.proto.IndexSearchData.LineitemResp getLineitems(int index);
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    int getLineitemsCount();
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    java.util.List<? extends com.zero.proto.IndexSearchData.LineitemRespOrBuilder>
        getLineitemsOrBuilderList();
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    com.zero.proto.IndexSearchData.LineitemRespOrBuilder getLineitemsOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code SearchResp}
   *
   * <pre>
   ***********投放单的检索结果**********
   * </pre>
   */
  public static final class SearchResp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SearchResp)
      SearchRespOrBuilder {
    // Use SearchResp.newBuilder() to construct.
    private SearchResp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SearchResp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SearchResp defaultInstance;
    public static SearchResp getDefaultInstance() {
      return defaultInstance;
    }

    public SearchResp getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SearchResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              adunitId_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                lineitems_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.LineitemResp>();
                mutable_bitField0_ |= 0x00000002;
              }
              lineitems_.add(input.readMessage(com.zero.proto.IndexSearchData.LineitemResp.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          lineitems_ = java.util.Collections.unmodifiableList(lineitems_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_SearchResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_SearchResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zero.proto.IndexSearchData.SearchResp.class, com.zero.proto.IndexSearchData.SearchResp.Builder.class);
    }

    public static com.google.protobuf.Parser<SearchResp> PARSER =
        new com.google.protobuf.AbstractParser<SearchResp>() {
      public SearchResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SearchResp(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<SearchResp> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ADUNITID_FIELD_NUMBER = 1;
    private Object adunitId_;
    /**
     * <code>required string adunitId = 1;</code>
     */
    public boolean hasAdunitId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string adunitId = 1;</code>
     */
    public String getAdunitId() {
      Object ref = adunitId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          adunitId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string adunitId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAdunitIdBytes() {
      Object ref = adunitId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        adunitId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINEITEMS_FIELD_NUMBER = 2;
    private java.util.List<com.zero.proto.IndexSearchData.LineitemResp> lineitems_;
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    public java.util.List<com.zero.proto.IndexSearchData.LineitemResp> getLineitemsList() {
      return lineitems_;
    }
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    public java.util.List<? extends com.zero.proto.IndexSearchData.LineitemRespOrBuilder>
        getLineitemsOrBuilderList() {
      return lineitems_;
    }
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    public int getLineitemsCount() {
      return lineitems_.size();
    }
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    public com.zero.proto.IndexSearchData.LineitemResp getLineitems(int index) {
      return lineitems_.get(index);
    }
    /**
     * <code>repeated .LineitemResp lineitems = 2;</code>
     */
    public com.zero.proto.IndexSearchData.LineitemRespOrBuilder getLineitemsOrBuilder(
        int index) {
      return lineitems_.get(index);
    }

    private void initFields() {
      adunitId_ = "";
      lineitems_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAdunitId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getLineitemsCount(); i++) {
        if (!getLineitems(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAdunitIdBytes());
      }
      for (int i = 0; i < lineitems_.size(); i++) {
        output.writeMessage(2, lineitems_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getAdunitIdBytes());
      }
      for (int i = 0; i < lineitems_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, lineitems_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.SearchResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zero.proto.IndexSearchData.SearchResp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SearchResp}
     *
     * <pre>
     ***********投放单的检索结果**********
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SearchResp)
        com.zero.proto.IndexSearchData.SearchRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_SearchResp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_SearchResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zero.proto.IndexSearchData.SearchResp.class, com.zero.proto.IndexSearchData.SearchResp.Builder.class);
      }

      // Construct using com.zero.proto.IndexSearchData.SearchResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLineitemsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        adunitId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (lineitemsBuilder_ == null) {
          lineitems_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          lineitemsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_SearchResp_descriptor;
      }

      public com.zero.proto.IndexSearchData.SearchResp getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.zero.proto.IndexSearchData.SearchResp build() {
        com.zero.proto.IndexSearchData.SearchResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zero.proto.IndexSearchData.SearchResp buildPartial() {
        com.zero.proto.IndexSearchData.SearchResp result = new com.zero.proto.IndexSearchData.SearchResp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.adunitId_ = adunitId_;
        if (lineitemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            lineitems_ = java.util.Collections.unmodifiableList(lineitems_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.lineitems_ = lineitems_;
        } else {
          result.lineitems_ = lineitemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zero.proto.IndexSearchData.SearchResp) {
          return mergeFrom((com.zero.proto.IndexSearchData.SearchResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zero.proto.IndexSearchData.SearchResp other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasAdunitId()) {
          bitField0_ |= 0x00000001;
          adunitId_ = other.adunitId_;
          onChanged();
        }
        if (lineitemsBuilder_ == null) {
          if (!other.lineitems_.isEmpty()) {
            if (lineitems_.isEmpty()) {
              lineitems_ = other.lineitems_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureLineitemsIsMutable();
              lineitems_.addAll(other.lineitems_);
            }
            onChanged();
          }
        } else {
          if (!other.lineitems_.isEmpty()) {
            if (lineitemsBuilder_.isEmpty()) {
              lineitemsBuilder_.dispose();
              lineitemsBuilder_ = null;
              lineitems_ = other.lineitems_;
              bitField0_ = (bitField0_ & ~0x00000002);
              lineitemsBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getLineitemsFieldBuilder() : null;
            } else {
              lineitemsBuilder_.addAllMessages(other.lineitems_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAdunitId()) {

          return false;
        }
        for (int i = 0; i < getLineitemsCount(); i++) {
          if (!getLineitems(i).isInitialized()) {

            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zero.proto.IndexSearchData.SearchResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zero.proto.IndexSearchData.SearchResp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object adunitId_ = "";
      /**
       * <code>required string adunitId = 1;</code>
       */
      public boolean hasAdunitId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public String getAdunitId() {
        Object ref = adunitId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            adunitId_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAdunitIdBytes() {
        Object ref = adunitId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          adunitId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public Builder setAdunitId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        adunitId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public Builder clearAdunitId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        adunitId_ = getDefaultInstance().getAdunitId();
        onChanged();
        return this;
      }
      /**
       * <code>required string adunitId = 1;</code>
       */
      public Builder setAdunitIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        adunitId_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.zero.proto.IndexSearchData.LineitemResp> lineitems_ =
        java.util.Collections.emptyList();
      private void ensureLineitemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          lineitems_ = new java.util.ArrayList<com.zero.proto.IndexSearchData.LineitemResp>(lineitems_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.LineitemResp, com.zero.proto.IndexSearchData.LineitemResp.Builder, com.zero.proto.IndexSearchData.LineitemRespOrBuilder> lineitemsBuilder_;

      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public java.util.List<com.zero.proto.IndexSearchData.LineitemResp> getLineitemsList() {
        if (lineitemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(lineitems_);
        } else {
          return lineitemsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public int getLineitemsCount() {
        if (lineitemsBuilder_ == null) {
          return lineitems_.size();
        } else {
          return lineitemsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public com.zero.proto.IndexSearchData.LineitemResp getLineitems(int index) {
        if (lineitemsBuilder_ == null) {
          return lineitems_.get(index);
        } else {
          return lineitemsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder setLineitems(
          int index, com.zero.proto.IndexSearchData.LineitemResp value) {
        if (lineitemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLineitemsIsMutable();
          lineitems_.set(index, value);
          onChanged();
        } else {
          lineitemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder setLineitems(
          int index, com.zero.proto.IndexSearchData.LineitemResp.Builder builderForValue) {
        if (lineitemsBuilder_ == null) {
          ensureLineitemsIsMutable();
          lineitems_.set(index, builderForValue.build());
          onChanged();
        } else {
          lineitemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder addLineitems(com.zero.proto.IndexSearchData.LineitemResp value) {
        if (lineitemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLineitemsIsMutable();
          lineitems_.add(value);
          onChanged();
        } else {
          lineitemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder addLineitems(
          int index, com.zero.proto.IndexSearchData.LineitemResp value) {
        if (lineitemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLineitemsIsMutable();
          lineitems_.add(index, value);
          onChanged();
        } else {
          lineitemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder addLineitems(
          com.zero.proto.IndexSearchData.LineitemResp.Builder builderForValue) {
        if (lineitemsBuilder_ == null) {
          ensureLineitemsIsMutable();
          lineitems_.add(builderForValue.build());
          onChanged();
        } else {
          lineitemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder addLineitems(
          int index, com.zero.proto.IndexSearchData.LineitemResp.Builder builderForValue) {
        if (lineitemsBuilder_ == null) {
          ensureLineitemsIsMutable();
          lineitems_.add(index, builderForValue.build());
          onChanged();
        } else {
          lineitemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder addAllLineitems(
          Iterable<? extends com.zero.proto.IndexSearchData.LineitemResp> values) {
        if (lineitemsBuilder_ == null) {
          ensureLineitemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, lineitems_);
          onChanged();
        } else {
          lineitemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder clearLineitems() {
        if (lineitemsBuilder_ == null) {
          lineitems_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          lineitemsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public Builder removeLineitems(int index) {
        if (lineitemsBuilder_ == null) {
          ensureLineitemsIsMutable();
          lineitems_.remove(index);
          onChanged();
        } else {
          lineitemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public com.zero.proto.IndexSearchData.LineitemResp.Builder getLineitemsBuilder(
          int index) {
        return getLineitemsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public com.zero.proto.IndexSearchData.LineitemRespOrBuilder getLineitemsOrBuilder(
          int index) {
        if (lineitemsBuilder_ == null) {
          return lineitems_.get(index);  } else {
          return lineitemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public java.util.List<? extends com.zero.proto.IndexSearchData.LineitemRespOrBuilder>
           getLineitemsOrBuilderList() {
        if (lineitemsBuilder_ != null) {
          return lineitemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(lineitems_);
        }
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public com.zero.proto.IndexSearchData.LineitemResp.Builder addLineitemsBuilder() {
        return getLineitemsFieldBuilder().addBuilder(
            com.zero.proto.IndexSearchData.LineitemResp.getDefaultInstance());
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public com.zero.proto.IndexSearchData.LineitemResp.Builder addLineitemsBuilder(
          int index) {
        return getLineitemsFieldBuilder().addBuilder(
            index, com.zero.proto.IndexSearchData.LineitemResp.getDefaultInstance());
      }
      /**
       * <code>repeated .LineitemResp lineitems = 2;</code>
       */
      public java.util.List<com.zero.proto.IndexSearchData.LineitemResp.Builder>
           getLineitemsBuilderList() {
        return getLineitemsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.zero.proto.IndexSearchData.LineitemResp, com.zero.proto.IndexSearchData.LineitemResp.Builder, com.zero.proto.IndexSearchData.LineitemRespOrBuilder>
          getLineitemsFieldBuilder() {
        if (lineitemsBuilder_ == null) {
          lineitemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.zero.proto.IndexSearchData.LineitemResp, com.zero.proto.IndexSearchData.LineitemResp.Builder, com.zero.proto.IndexSearchData.LineitemRespOrBuilder>(
                  lineitems_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          lineitems_ = null;
        }
        return lineitemsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:SearchResp)
    }

    static {
      defaultInstance = new SearchResp(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SearchResp)
  }

  public interface LineitemRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LineitemResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string lineitemId = 1;</code>
     */
    boolean hasLineitemId();
    /**
     * <code>required string lineitemId = 1;</code>
     */
    String getLineitemId();
    /**
     * <code>required string lineitemId = 1;</code>
     */
    com.google.protobuf.ByteString
        getLineitemIdBytes();

    /**
     * <code>required string directional = 2;</code>
     */
    boolean hasDirectional();
    /**
     * <code>required string directional = 2;</code>
     */
    String getDirectional();
    /**
     * <code>required string directional = 2;</code>
     */
    com.google.protobuf.ByteString
        getDirectionalBytes();

    /**
     * <code>required string adIds = 3;</code>
     */
    boolean hasAdIds();
    /**
     * <code>required string adIds = 3;</code>
     */
    String getAdIds();
    /**
     * <code>required string adIds = 3;</code>
     */
    com.google.protobuf.ByteString
        getAdIdsBytes();
  }
  /**
   * Protobuf type {@code LineitemResp}
   */
  public static final class LineitemResp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:LineitemResp)
      LineitemRespOrBuilder {
    // Use LineitemResp.newBuilder() to construct.
    private LineitemResp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LineitemResp(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LineitemResp defaultInstance;
    public static LineitemResp getDefaultInstance() {
      return defaultInstance;
    }

    public LineitemResp getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LineitemResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              lineitemId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              directional_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              adIds_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_LineitemResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_LineitemResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zero.proto.IndexSearchData.LineitemResp.class, com.zero.proto.IndexSearchData.LineitemResp.Builder.class);
    }

    public static com.google.protobuf.Parser<LineitemResp> PARSER =
        new com.google.protobuf.AbstractParser<LineitemResp>() {
      public LineitemResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LineitemResp(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<LineitemResp> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LINEITEMID_FIELD_NUMBER = 1;
    private Object lineitemId_;
    /**
     * <code>required string lineitemId = 1;</code>
     */
    public boolean hasLineitemId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string lineitemId = 1;</code>
     */
    public String getLineitemId() {
      Object ref = lineitemId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lineitemId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string lineitemId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLineitemIdBytes() {
      Object ref = lineitemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        lineitemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DIRECTIONAL_FIELD_NUMBER = 2;
    private Object directional_;
    /**
     * <code>required string directional = 2;</code>
     */
    public boolean hasDirectional() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string directional = 2;</code>
     */
    public String getDirectional() {
      Object ref = directional_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          directional_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string directional = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDirectionalBytes() {
      Object ref = directional_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        directional_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADIDS_FIELD_NUMBER = 3;
    private Object adIds_;
    /**
     * <code>required string adIds = 3;</code>
     */
    public boolean hasAdIds() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string adIds = 3;</code>
     */
    public String getAdIds() {
      Object ref = adIds_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          adIds_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string adIds = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAdIdsBytes() {
      Object ref = adIds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        adIds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      lineitemId_ = "";
      directional_ = "";
      adIds_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasLineitemId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDirectional()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAdIds()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getLineitemIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDirectionalBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getAdIdsBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getLineitemIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDirectionalBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getAdIdsBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.zero.proto.IndexSearchData.LineitemResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.zero.proto.IndexSearchData.LineitemResp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LineitemResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LineitemResp)
        com.zero.proto.IndexSearchData.LineitemRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_LineitemResp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_LineitemResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zero.proto.IndexSearchData.LineitemResp.class, com.zero.proto.IndexSearchData.LineitemResp.Builder.class);
      }

      // Construct using com.zero.proto.IndexSearchData.LineitemResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        lineitemId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        directional_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        adIds_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_LineitemResp_descriptor;
      }

      public com.zero.proto.IndexSearchData.LineitemResp getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.zero.proto.IndexSearchData.LineitemResp build() {
        com.zero.proto.IndexSearchData.LineitemResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.zero.proto.IndexSearchData.LineitemResp buildPartial() {
        com.zero.proto.IndexSearchData.LineitemResp result = new com.zero.proto.IndexSearchData.LineitemResp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.lineitemId_ = lineitemId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.directional_ = directional_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.adIds_ = adIds_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zero.proto.IndexSearchData.LineitemResp) {
          return mergeFrom((com.zero.proto.IndexSearchData.LineitemResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zero.proto.IndexSearchData.LineitemResp other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasLineitemId()) {
          bitField0_ |= 0x00000001;
          lineitemId_ = other.lineitemId_;
          onChanged();
        }
        if (other.hasDirectional()) {
          bitField0_ |= 0x00000002;
          directional_ = other.directional_;
          onChanged();
        }
        if (other.hasAdIds()) {
          bitField0_ |= 0x00000004;
          adIds_ = other.adIds_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasLineitemId()) {

          return false;
        }
        if (!hasDirectional()) {

          return false;
        }
        if (!hasAdIds()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zero.proto.IndexSearchData.LineitemResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zero.proto.IndexSearchData.LineitemResp) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object lineitemId_ = "";
      /**
       * <code>required string lineitemId = 1;</code>
       */
      public boolean hasLineitemId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string lineitemId = 1;</code>
       */
      public String getLineitemId() {
        Object ref = lineitemId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            lineitemId_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string lineitemId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getLineitemIdBytes() {
        Object ref = lineitemId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          lineitemId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string lineitemId = 1;</code>
       */
      public Builder setLineitemId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        lineitemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string lineitemId = 1;</code>
       */
      public Builder clearLineitemId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        lineitemId_ = getDefaultInstance().getLineitemId();
        onChanged();
        return this;
      }
      /**
       * <code>required string lineitemId = 1;</code>
       */
      public Builder setLineitemIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        lineitemId_ = value;
        onChanged();
        return this;
      }

      private Object directional_ = "";
      /**
       * <code>required string directional = 2;</code>
       */
      public boolean hasDirectional() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string directional = 2;</code>
       */
      public String getDirectional() {
        Object ref = directional_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            directional_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string directional = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDirectionalBytes() {
        Object ref = directional_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          directional_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string directional = 2;</code>
       */
      public Builder setDirectional(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        directional_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string directional = 2;</code>
       */
      public Builder clearDirectional() {
        bitField0_ = (bitField0_ & ~0x00000002);
        directional_ = getDefaultInstance().getDirectional();
        onChanged();
        return this;
      }
      /**
       * <code>required string directional = 2;</code>
       */
      public Builder setDirectionalBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        directional_ = value;
        onChanged();
        return this;
      }

      private Object adIds_ = "";
      /**
       * <code>required string adIds = 3;</code>
       */
      public boolean hasAdIds() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string adIds = 3;</code>
       */
      public String getAdIds() {
        Object ref = adIds_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            adIds_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string adIds = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAdIdsBytes() {
        Object ref = adIds_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          adIds_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string adIds = 3;</code>
       */
      public Builder setAdIds(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        adIds_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string adIds = 3;</code>
       */
      public Builder clearAdIds() {
        bitField0_ = (bitField0_ & ~0x00000004);
        adIds_ = getDefaultInstance().getAdIds();
        onChanged();
        return this;
      }
      /**
       * <code>required string adIds = 3;</code>
       */
      public Builder setAdIdsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        adIds_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:LineitemResp)
    }

    static {
      defaultInstance = new LineitemResp(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:LineitemResp)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IndexRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_IndexRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IndexResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_IndexResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SearchReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Target_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Target_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SearchResp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LineitemResp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_LineitemResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025IndexSearchData.proto\"*\n\014IndexRequest\022" +
      "\032\n\006search\030\001 \003(\0132\n.SearchReq\",\n\rIndexResp" +
      "onse\022\033\n\006result\030\001 \003(\0132\013.SearchResp\"7\n\tSea" +
      "rchReq\022\020\n\010adunitId\030\001 \002(\t\022\030\n\007targets\030\002 \003(" +
      "\0132\007.Target\"%\n\006Target\022\014\n\004type\030\001 \002(\t\022\r\n\005va" +
      "lue\030\002 \002(\t\"@\n\nSearchResp\022\020\n\010adunitId\030\001 \002(" +
      "\t\022 \n\tlineitems\030\002 \003(\0132\r.LineitemResp\"F\n\014L" +
      "ineitemResp\022\022\n\nlineitemId\030\001 \002(\t\022\023\n\013direc" +
      "tional\030\002 \002(\t\022\r\n\005adIds\030\003 \002(\tB\020\n\016com.zero." +
      "proto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_IndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_IndexRequest_descriptor,
        new String[] { "Search", });
    internal_static_IndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_IndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_IndexResponse_descriptor,
        new String[] { "Result", });
    internal_static_SearchReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SearchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SearchReq_descriptor,
        new String[] { "AdunitId", "Targets", });
    internal_static_Target_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Target_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Target_descriptor,
        new String[] { "Type", "Value", });
    internal_static_SearchResp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SearchResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SearchResp_descriptor,
        new String[] { "AdunitId", "Lineitems", });
    internal_static_LineitemResp_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_LineitemResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_LineitemResp_descriptor,
        new String[] { "LineitemId", "Directional", "AdIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
