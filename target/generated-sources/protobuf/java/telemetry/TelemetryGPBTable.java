// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry.proto

package telemetry;

/**
 * Protobuf type {@code helloworld.TelemetryGPBTable}
 */
public  final class TelemetryGPBTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.TelemetryGPBTable)
    TelemetryGPBTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TelemetryGPBTable.newBuilder() to construct.
  private TelemetryGPBTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelemetryGPBTable() {
    row_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TelemetryGPBTable(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              row_ = new java.util.ArrayList<telemetry.TelemetryRowGPB>();
              mutable_bitField0_ |= 0x00000001;
            }
            row_.add(
                input.readMessage(telemetry.TelemetryRowGPB.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        row_ = java.util.Collections.unmodifiableList(row_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return telemetry.TelemetryProto.internal_static_helloworld_TelemetryGPBTable_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return telemetry.TelemetryProto.internal_static_helloworld_TelemetryGPBTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            telemetry.TelemetryGPBTable.class, telemetry.TelemetryGPBTable.Builder.class);
  }

  public static final int ROW_FIELD_NUMBER = 1;
  private java.util.List<telemetry.TelemetryRowGPB> row_;
  /**
   * <pre>
   *TelemetryGPBTable消息结构定义。
   * </pre>
   *
   * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
   */
  public java.util.List<telemetry.TelemetryRowGPB> getRowList() {
    return row_;
  }
  /**
   * <pre>
   *TelemetryGPBTable消息结构定义。
   * </pre>
   *
   * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
   */
  public java.util.List<? extends telemetry.TelemetryRowGPBOrBuilder> 
      getRowOrBuilderList() {
    return row_;
  }
  /**
   * <pre>
   *TelemetryGPBTable消息结构定义。
   * </pre>
   *
   * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
   */
  public int getRowCount() {
    return row_.size();
  }
  /**
   * <pre>
   *TelemetryGPBTable消息结构定义。
   * </pre>
   *
   * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
   */
  public telemetry.TelemetryRowGPB getRow(int index) {
    return row_.get(index);
  }
  /**
   * <pre>
   *TelemetryGPBTable消息结构定义。
   * </pre>
   *
   * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
   */
  public telemetry.TelemetryRowGPBOrBuilder getRowOrBuilder(
      int index) {
    return row_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < row_.size(); i++) {
      output.writeMessage(1, row_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < row_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, row_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof telemetry.TelemetryGPBTable)) {
      return super.equals(obj);
    }
    telemetry.TelemetryGPBTable other = (telemetry.TelemetryGPBTable) obj;

    boolean result = true;
    result = result && getRowList()
        .equals(other.getRowList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRowCount() > 0) {
      hash = (37 * hash) + ROW_FIELD_NUMBER;
      hash = (53 * hash) + getRowList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static telemetry.TelemetryGPBTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static telemetry.TelemetryGPBTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static telemetry.TelemetryGPBTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static telemetry.TelemetryGPBTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static telemetry.TelemetryGPBTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static telemetry.TelemetryGPBTable parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(telemetry.TelemetryGPBTable prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helloworld.TelemetryGPBTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.TelemetryGPBTable)
      telemetry.TelemetryGPBTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return telemetry.TelemetryProto.internal_static_helloworld_TelemetryGPBTable_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return telemetry.TelemetryProto.internal_static_helloworld_TelemetryGPBTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              telemetry.TelemetryGPBTable.class, telemetry.TelemetryGPBTable.Builder.class);
    }

    // Construct using telemetry.TelemetryGPBTable.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRowFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (rowBuilder_ == null) {
        row_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rowBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return telemetry.TelemetryProto.internal_static_helloworld_TelemetryGPBTable_descriptor;
    }

    public telemetry.TelemetryGPBTable getDefaultInstanceForType() {
      return telemetry.TelemetryGPBTable.getDefaultInstance();
    }

    public telemetry.TelemetryGPBTable build() {
      telemetry.TelemetryGPBTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public telemetry.TelemetryGPBTable buildPartial() {
      telemetry.TelemetryGPBTable result = new telemetry.TelemetryGPBTable(this);
      int from_bitField0_ = bitField0_;
      if (rowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          row_ = java.util.Collections.unmodifiableList(row_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.row_ = row_;
      } else {
        result.row_ = rowBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof telemetry.TelemetryGPBTable) {
        return mergeFrom((telemetry.TelemetryGPBTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(telemetry.TelemetryGPBTable other) {
      if (other == telemetry.TelemetryGPBTable.getDefaultInstance()) return this;
      if (rowBuilder_ == null) {
        if (!other.row_.isEmpty()) {
          if (row_.isEmpty()) {
            row_ = other.row_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRowIsMutable();
            row_.addAll(other.row_);
          }
          onChanged();
        }
      } else {
        if (!other.row_.isEmpty()) {
          if (rowBuilder_.isEmpty()) {
            rowBuilder_.dispose();
            rowBuilder_ = null;
            row_ = other.row_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rowBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRowFieldBuilder() : null;
          } else {
            rowBuilder_.addAllMessages(other.row_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      telemetry.TelemetryGPBTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (telemetry.TelemetryGPBTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<telemetry.TelemetryRowGPB> row_ =
      java.util.Collections.emptyList();
    private void ensureRowIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        row_ = new java.util.ArrayList<telemetry.TelemetryRowGPB>(row_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        telemetry.TelemetryRowGPB, telemetry.TelemetryRowGPB.Builder, telemetry.TelemetryRowGPBOrBuilder> rowBuilder_;

    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public java.util.List<telemetry.TelemetryRowGPB> getRowList() {
      if (rowBuilder_ == null) {
        return java.util.Collections.unmodifiableList(row_);
      } else {
        return rowBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public int getRowCount() {
      if (rowBuilder_ == null) {
        return row_.size();
      } else {
        return rowBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public telemetry.TelemetryRowGPB getRow(int index) {
      if (rowBuilder_ == null) {
        return row_.get(index);
      } else {
        return rowBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder setRow(
        int index, telemetry.TelemetryRowGPB value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowIsMutable();
        row_.set(index, value);
        onChanged();
      } else {
        rowBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder setRow(
        int index, telemetry.TelemetryRowGPB.Builder builderForValue) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder addRow(telemetry.TelemetryRowGPB value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowIsMutable();
        row_.add(value);
        onChanged();
      } else {
        rowBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder addRow(
        int index, telemetry.TelemetryRowGPB value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowIsMutable();
        row_.add(index, value);
        onChanged();
      } else {
        rowBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder addRow(
        telemetry.TelemetryRowGPB.Builder builderForValue) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.add(builderForValue.build());
        onChanged();
      } else {
        rowBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder addRow(
        int index, telemetry.TelemetryRowGPB.Builder builderForValue) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder addAllRow(
        java.lang.Iterable<? extends telemetry.TelemetryRowGPB> values) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, row_);
        onChanged();
      } else {
        rowBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder clearRow() {
      if (rowBuilder_ == null) {
        row_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rowBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public Builder removeRow(int index) {
      if (rowBuilder_ == null) {
        ensureRowIsMutable();
        row_.remove(index);
        onChanged();
      } else {
        rowBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public telemetry.TelemetryRowGPB.Builder getRowBuilder(
        int index) {
      return getRowFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public telemetry.TelemetryRowGPBOrBuilder getRowOrBuilder(
        int index) {
      if (rowBuilder_ == null) {
        return row_.get(index);  } else {
        return rowBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public java.util.List<? extends telemetry.TelemetryRowGPBOrBuilder> 
         getRowOrBuilderList() {
      if (rowBuilder_ != null) {
        return rowBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(row_);
      }
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public telemetry.TelemetryRowGPB.Builder addRowBuilder() {
      return getRowFieldBuilder().addBuilder(
          telemetry.TelemetryRowGPB.getDefaultInstance());
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public telemetry.TelemetryRowGPB.Builder addRowBuilder(
        int index) {
      return getRowFieldBuilder().addBuilder(
          index, telemetry.TelemetryRowGPB.getDefaultInstance());
    }
    /**
     * <pre>
     *TelemetryGPBTable消息结构定义。
     * </pre>
     *
     * <code>repeated .helloworld.TelemetryRowGPB row = 1;</code>
     */
    public java.util.List<telemetry.TelemetryRowGPB.Builder> 
         getRowBuilderList() {
      return getRowFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        telemetry.TelemetryRowGPB, telemetry.TelemetryRowGPB.Builder, telemetry.TelemetryRowGPBOrBuilder> 
        getRowFieldBuilder() {
      if (rowBuilder_ == null) {
        rowBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            telemetry.TelemetryRowGPB, telemetry.TelemetryRowGPB.Builder, telemetry.TelemetryRowGPBOrBuilder>(
                row_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        row_ = null;
      }
      return rowBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helloworld.TelemetryGPBTable)
  }

  // @@protoc_insertion_point(class_scope:helloworld.TelemetryGPBTable)
  private static final telemetry.TelemetryGPBTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new telemetry.TelemetryGPBTable();
  }

  public static telemetry.TelemetryGPBTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelemetryGPBTable>
      PARSER = new com.google.protobuf.AbstractParser<TelemetryGPBTable>() {
    public TelemetryGPBTable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TelemetryGPBTable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TelemetryGPBTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelemetryGPBTable> getParserForType() {
    return PARSER;
  }

  public telemetry.TelemetryGPBTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

