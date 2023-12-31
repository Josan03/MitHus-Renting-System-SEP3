// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package dk.via.mithus.protobuf;

/**
 * Protobuf type {@code dk.via.mithus.protobuf.HousingTypes}
 */
public final class HousingTypes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dk.via.mithus.protobuf.HousingTypes)
    HousingTypesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HousingTypes.newBuilder() to construct.
  private HousingTypes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HousingTypes() {
    housingTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HousingTypes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HousingTypes(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              housingTypes_ = new java.util.ArrayList<dk.via.mithus.protobuf.HousingType>();
              mutable_bitField0_ |= 0x00000001;
            }
            housingTypes_.add(
                input.readMessage(dk.via.mithus.protobuf.HousingType.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        housingTypes_ = java.util.Collections.unmodifiableList(housingTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_HousingTypes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_HousingTypes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.mithus.protobuf.HousingTypes.class, dk.via.mithus.protobuf.HousingTypes.Builder.class);
  }

  public static final int HOUSINGTYPES_FIELD_NUMBER = 1;
  private java.util.List<dk.via.mithus.protobuf.HousingType> housingTypes_;
  /**
   * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<dk.via.mithus.protobuf.HousingType> getHousingTypesList() {
    return housingTypes_;
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends dk.via.mithus.protobuf.HousingTypeOrBuilder> 
      getHousingTypesOrBuilderList() {
    return housingTypes_;
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
   */
  @java.lang.Override
  public int getHousingTypesCount() {
    return housingTypes_.size();
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
   */
  @java.lang.Override
  public dk.via.mithus.protobuf.HousingType getHousingTypes(int index) {
    return housingTypes_.get(index);
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
   */
  @java.lang.Override
  public dk.via.mithus.protobuf.HousingTypeOrBuilder getHousingTypesOrBuilder(
      int index) {
    return housingTypes_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < housingTypes_.size(); i++) {
      output.writeMessage(1, housingTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < housingTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, housingTypes_.get(i));
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
    if (!(obj instanceof dk.via.mithus.protobuf.HousingTypes)) {
      return super.equals(obj);
    }
    dk.via.mithus.protobuf.HousingTypes other = (dk.via.mithus.protobuf.HousingTypes) obj;

    if (!getHousingTypesList()
        .equals(other.getHousingTypesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getHousingTypesCount() > 0) {
      hash = (37 * hash) + HOUSINGTYPES_FIELD_NUMBER;
      hash = (53 * hash) + getHousingTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.mithus.protobuf.HousingTypes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dk.via.mithus.protobuf.HousingTypes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code dk.via.mithus.protobuf.HousingTypes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dk.via.mithus.protobuf.HousingTypes)
      dk.via.mithus.protobuf.HousingTypesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_HousingTypes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_HousingTypes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.mithus.protobuf.HousingTypes.class, dk.via.mithus.protobuf.HousingTypes.Builder.class);
    }

    // Construct using dk.via.mithus.protobuf.HousingTypes.newBuilder()
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
        getHousingTypesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (housingTypesBuilder_ == null) {
        housingTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        housingTypesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_HousingTypes_descriptor;
    }

    @java.lang.Override
    public dk.via.mithus.protobuf.HousingTypes getDefaultInstanceForType() {
      return dk.via.mithus.protobuf.HousingTypes.getDefaultInstance();
    }

    @java.lang.Override
    public dk.via.mithus.protobuf.HousingTypes build() {
      dk.via.mithus.protobuf.HousingTypes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dk.via.mithus.protobuf.HousingTypes buildPartial() {
      dk.via.mithus.protobuf.HousingTypes result = new dk.via.mithus.protobuf.HousingTypes(this);
      int from_bitField0_ = bitField0_;
      if (housingTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          housingTypes_ = java.util.Collections.unmodifiableList(housingTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.housingTypes_ = housingTypes_;
      } else {
        result.housingTypes_ = housingTypesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dk.via.mithus.protobuf.HousingTypes) {
        return mergeFrom((dk.via.mithus.protobuf.HousingTypes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.mithus.protobuf.HousingTypes other) {
      if (other == dk.via.mithus.protobuf.HousingTypes.getDefaultInstance()) return this;
      if (housingTypesBuilder_ == null) {
        if (!other.housingTypes_.isEmpty()) {
          if (housingTypes_.isEmpty()) {
            housingTypes_ = other.housingTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHousingTypesIsMutable();
            housingTypes_.addAll(other.housingTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.housingTypes_.isEmpty()) {
          if (housingTypesBuilder_.isEmpty()) {
            housingTypesBuilder_.dispose();
            housingTypesBuilder_ = null;
            housingTypes_ = other.housingTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            housingTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHousingTypesFieldBuilder() : null;
          } else {
            housingTypesBuilder_.addAllMessages(other.housingTypes_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dk.via.mithus.protobuf.HousingTypes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.mithus.protobuf.HousingTypes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<dk.via.mithus.protobuf.HousingType> housingTypes_ =
      java.util.Collections.emptyList();
    private void ensureHousingTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        housingTypes_ = new java.util.ArrayList<dk.via.mithus.protobuf.HousingType>(housingTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        dk.via.mithus.protobuf.HousingType, dk.via.mithus.protobuf.HousingType.Builder, dk.via.mithus.protobuf.HousingTypeOrBuilder> housingTypesBuilder_;

    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public java.util.List<dk.via.mithus.protobuf.HousingType> getHousingTypesList() {
      if (housingTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(housingTypes_);
      } else {
        return housingTypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public int getHousingTypesCount() {
      if (housingTypesBuilder_ == null) {
        return housingTypes_.size();
      } else {
        return housingTypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public dk.via.mithus.protobuf.HousingType getHousingTypes(int index) {
      if (housingTypesBuilder_ == null) {
        return housingTypes_.get(index);
      } else {
        return housingTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder setHousingTypes(
        int index, dk.via.mithus.protobuf.HousingType value) {
      if (housingTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHousingTypesIsMutable();
        housingTypes_.set(index, value);
        onChanged();
      } else {
        housingTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder setHousingTypes(
        int index, dk.via.mithus.protobuf.HousingType.Builder builderForValue) {
      if (housingTypesBuilder_ == null) {
        ensureHousingTypesIsMutable();
        housingTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        housingTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder addHousingTypes(dk.via.mithus.protobuf.HousingType value) {
      if (housingTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHousingTypesIsMutable();
        housingTypes_.add(value);
        onChanged();
      } else {
        housingTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder addHousingTypes(
        int index, dk.via.mithus.protobuf.HousingType value) {
      if (housingTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHousingTypesIsMutable();
        housingTypes_.add(index, value);
        onChanged();
      } else {
        housingTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder addHousingTypes(
        dk.via.mithus.protobuf.HousingType.Builder builderForValue) {
      if (housingTypesBuilder_ == null) {
        ensureHousingTypesIsMutable();
        housingTypes_.add(builderForValue.build());
        onChanged();
      } else {
        housingTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder addHousingTypes(
        int index, dk.via.mithus.protobuf.HousingType.Builder builderForValue) {
      if (housingTypesBuilder_ == null) {
        ensureHousingTypesIsMutable();
        housingTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        housingTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder addAllHousingTypes(
        java.lang.Iterable<? extends dk.via.mithus.protobuf.HousingType> values) {
      if (housingTypesBuilder_ == null) {
        ensureHousingTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, housingTypes_);
        onChanged();
      } else {
        housingTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder clearHousingTypes() {
      if (housingTypesBuilder_ == null) {
        housingTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        housingTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public Builder removeHousingTypes(int index) {
      if (housingTypesBuilder_ == null) {
        ensureHousingTypesIsMutable();
        housingTypes_.remove(index);
        onChanged();
      } else {
        housingTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public dk.via.mithus.protobuf.HousingType.Builder getHousingTypesBuilder(
        int index) {
      return getHousingTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public dk.via.mithus.protobuf.HousingTypeOrBuilder getHousingTypesOrBuilder(
        int index) {
      if (housingTypesBuilder_ == null) {
        return housingTypes_.get(index);  } else {
        return housingTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public java.util.List<? extends dk.via.mithus.protobuf.HousingTypeOrBuilder> 
         getHousingTypesOrBuilderList() {
      if (housingTypesBuilder_ != null) {
        return housingTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(housingTypes_);
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public dk.via.mithus.protobuf.HousingType.Builder addHousingTypesBuilder() {
      return getHousingTypesFieldBuilder().addBuilder(
          dk.via.mithus.protobuf.HousingType.getDefaultInstance());
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public dk.via.mithus.protobuf.HousingType.Builder addHousingTypesBuilder(
        int index) {
      return getHousingTypesFieldBuilder().addBuilder(
          index, dk.via.mithus.protobuf.HousingType.getDefaultInstance());
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.HousingType housingTypes = 1;</code>
     */
    public java.util.List<dk.via.mithus.protobuf.HousingType.Builder> 
         getHousingTypesBuilderList() {
      return getHousingTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        dk.via.mithus.protobuf.HousingType, dk.via.mithus.protobuf.HousingType.Builder, dk.via.mithus.protobuf.HousingTypeOrBuilder> 
        getHousingTypesFieldBuilder() {
      if (housingTypesBuilder_ == null) {
        housingTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            dk.via.mithus.protobuf.HousingType, dk.via.mithus.protobuf.HousingType.Builder, dk.via.mithus.protobuf.HousingTypeOrBuilder>(
                housingTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        housingTypes_ = null;
      }
      return housingTypesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:dk.via.mithus.protobuf.HousingTypes)
  }

  // @@protoc_insertion_point(class_scope:dk.via.mithus.protobuf.HousingTypes)
  private static final dk.via.mithus.protobuf.HousingTypes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.mithus.protobuf.HousingTypes();
  }

  public static dk.via.mithus.protobuf.HousingTypes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HousingTypes>
      PARSER = new com.google.protobuf.AbstractParser<HousingTypes>() {
    @java.lang.Override
    public HousingTypes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HousingTypes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HousingTypes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HousingTypes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dk.via.mithus.protobuf.HousingTypes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

