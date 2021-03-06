// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TopologyProto.proto

package org.onosproject.grpc.models;

public final class TopologyProtoOuterClass {
  private TopologyProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TopologyProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.TopologyProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 clusterCount = 1;</code>
     */
    int getClusterCount();

    /**
     * <code>int64 computeCost = 2;</code>
     */
    long getComputeCost();

    /**
     * <code>int64 creationTime = 3;</code>
     */
    long getCreationTime();

    /**
     * <code>int32 deviceCount = 4;</code>
     */
    int getDeviceCount();

    /**
     * <code>int32 linkCount = 5;</code>
     */
    int getLinkCount();

    /**
     * <code>int64 time = 6;</code>
     */
    long getTime();
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.Topology
   * </pre>
   *
   * Protobuf type {@code proto.TopologyProto}
   */
  public  static final class TopologyProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.TopologyProto)
      TopologyProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TopologyProto.newBuilder() to construct.
    private TopologyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TopologyProto() {
      clusterCount_ = 0;
      computeCost_ = 0L;
      creationTime_ = 0L;
      deviceCount_ = 0;
      linkCount_ = 0;
      time_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TopologyProto(
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
            case 8: {

              clusterCount_ = input.readInt32();
              break;
            }
            case 16: {

              computeCost_ = input.readInt64();
              break;
            }
            case 24: {

              creationTime_ = input.readInt64();
              break;
            }
            case 32: {

              deviceCount_ = input.readInt32();
              break;
            }
            case 40: {

              linkCount_ = input.readInt32();
              break;
            }
            case 48: {

              time_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.onosproject.grpc.models.TopologyProtoOuterClass.internal_static_proto_TopologyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.TopologyProtoOuterClass.internal_static_proto_TopologyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.class, org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.Builder.class);
    }

    public static final int CLUSTERCOUNT_FIELD_NUMBER = 1;
    private int clusterCount_;
    /**
     * <code>int32 clusterCount = 1;</code>
     */
    public int getClusterCount() {
      return clusterCount_;
    }

    public static final int COMPUTECOST_FIELD_NUMBER = 2;
    private long computeCost_;
    /**
     * <code>int64 computeCost = 2;</code>
     */
    public long getComputeCost() {
      return computeCost_;
    }

    public static final int CREATIONTIME_FIELD_NUMBER = 3;
    private long creationTime_;
    /**
     * <code>int64 creationTime = 3;</code>
     */
    public long getCreationTime() {
      return creationTime_;
    }

    public static final int DEVICECOUNT_FIELD_NUMBER = 4;
    private int deviceCount_;
    /**
     * <code>int32 deviceCount = 4;</code>
     */
    public int getDeviceCount() {
      return deviceCount_;
    }

    public static final int LINKCOUNT_FIELD_NUMBER = 5;
    private int linkCount_;
    /**
     * <code>int32 linkCount = 5;</code>
     */
    public int getLinkCount() {
      return linkCount_;
    }

    public static final int TIME_FIELD_NUMBER = 6;
    private long time_;
    /**
     * <code>int64 time = 6;</code>
     */
    public long getTime() {
      return time_;
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
      if (clusterCount_ != 0) {
        output.writeInt32(1, clusterCount_);
      }
      if (computeCost_ != 0L) {
        output.writeInt64(2, computeCost_);
      }
      if (creationTime_ != 0L) {
        output.writeInt64(3, creationTime_);
      }
      if (deviceCount_ != 0) {
        output.writeInt32(4, deviceCount_);
      }
      if (linkCount_ != 0) {
        output.writeInt32(5, linkCount_);
      }
      if (time_ != 0L) {
        output.writeInt64(6, time_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (clusterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, clusterCount_);
      }
      if (computeCost_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, computeCost_);
      }
      if (creationTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, creationTime_);
      }
      if (deviceCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, deviceCount_);
      }
      if (linkCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, linkCount_);
      }
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, time_);
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
      if (!(obj instanceof org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto other = (org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto) obj;

      boolean result = true;
      result = result && (getClusterCount()
          == other.getClusterCount());
      result = result && (getComputeCost()
          == other.getComputeCost());
      result = result && (getCreationTime()
          == other.getCreationTime());
      result = result && (getDeviceCount()
          == other.getDeviceCount());
      result = result && (getLinkCount()
          == other.getLinkCount());
      result = result && (getTime()
          == other.getTime());
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
      hash = (37 * hash) + CLUSTERCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getClusterCount();
      hash = (37 * hash) + COMPUTECOST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getComputeCost());
      hash = (37 * hash) + CREATIONTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCreationTime());
      hash = (37 * hash) + DEVICECOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceCount();
      hash = (37 * hash) + LINKCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getLinkCount();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto prototype) {
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
     * <pre>
     * Corresponds to org.onosproject.net.Topology
     * </pre>
     *
     * Protobuf type {@code proto.TopologyProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.TopologyProto)
        org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.TopologyProtoOuterClass.internal_static_proto_TopologyProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.TopologyProtoOuterClass.internal_static_proto_TopologyProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.class, org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        clusterCount_ = 0;

        computeCost_ = 0L;

        creationTime_ = 0L;

        deviceCount_ = 0;

        linkCount_ = 0;

        time_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.TopologyProtoOuterClass.internal_static_proto_TopologyProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto build() {
        org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto buildPartial() {
        org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto result = new org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto(this);
        result.clusterCount_ = clusterCount_;
        result.computeCost_ = computeCost_;
        result.creationTime_ = creationTime_;
        result.deviceCount_ = deviceCount_;
        result.linkCount_ = linkCount_;
        result.time_ = time_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto) {
          return mergeFrom((org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto other) {
        if (other == org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.getDefaultInstance()) return this;
        if (other.getClusterCount() != 0) {
          setClusterCount(other.getClusterCount());
        }
        if (other.getComputeCost() != 0L) {
          setComputeCost(other.getComputeCost());
        }
        if (other.getCreationTime() != 0L) {
          setCreationTime(other.getCreationTime());
        }
        if (other.getDeviceCount() != 0) {
          setDeviceCount(other.getDeviceCount());
        }
        if (other.getLinkCount() != 0) {
          setLinkCount(other.getLinkCount());
        }
        if (other.getTime() != 0L) {
          setTime(other.getTime());
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
        org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int clusterCount_ ;
      /**
       * <code>int32 clusterCount = 1;</code>
       */
      public int getClusterCount() {
        return clusterCount_;
      }
      /**
       * <code>int32 clusterCount = 1;</code>
       */
      public Builder setClusterCount(int value) {
        
        clusterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 clusterCount = 1;</code>
       */
      public Builder clearClusterCount() {
        
        clusterCount_ = 0;
        onChanged();
        return this;
      }

      private long computeCost_ ;
      /**
       * <code>int64 computeCost = 2;</code>
       */
      public long getComputeCost() {
        return computeCost_;
      }
      /**
       * <code>int64 computeCost = 2;</code>
       */
      public Builder setComputeCost(long value) {
        
        computeCost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 computeCost = 2;</code>
       */
      public Builder clearComputeCost() {
        
        computeCost_ = 0L;
        onChanged();
        return this;
      }

      private long creationTime_ ;
      /**
       * <code>int64 creationTime = 3;</code>
       */
      public long getCreationTime() {
        return creationTime_;
      }
      /**
       * <code>int64 creationTime = 3;</code>
       */
      public Builder setCreationTime(long value) {
        
        creationTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 creationTime = 3;</code>
       */
      public Builder clearCreationTime() {
        
        creationTime_ = 0L;
        onChanged();
        return this;
      }

      private int deviceCount_ ;
      /**
       * <code>int32 deviceCount = 4;</code>
       */
      public int getDeviceCount() {
        return deviceCount_;
      }
      /**
       * <code>int32 deviceCount = 4;</code>
       */
      public Builder setDeviceCount(int value) {
        
        deviceCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 deviceCount = 4;</code>
       */
      public Builder clearDeviceCount() {
        
        deviceCount_ = 0;
        onChanged();
        return this;
      }

      private int linkCount_ ;
      /**
       * <code>int32 linkCount = 5;</code>
       */
      public int getLinkCount() {
        return linkCount_;
      }
      /**
       * <code>int32 linkCount = 5;</code>
       */
      public Builder setLinkCount(int value) {
        
        linkCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 linkCount = 5;</code>
       */
      public Builder clearLinkCount() {
        
        linkCount_ = 0;
        onChanged();
        return this;
      }

      private long time_ ;
      /**
       * <code>int64 time = 6;</code>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>int64 time = 6;</code>
       */
      public Builder setTime(long value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 time = 6;</code>
       */
      public Builder clearTime() {
        
        time_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:proto.TopologyProto)
    }

    // @@protoc_insertion_point(class_scope:proto.TopologyProto)
    private static final org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto();
    }

    public static org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TopologyProto>
        PARSER = new com.google.protobuf.AbstractParser<TopologyProto>() {
      @java.lang.Override
      public TopologyProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TopologyProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TopologyProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TopologyProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_TopologyProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_TopologyProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TopologyProto.proto\022\005proto\"\206\001\n\rTopolog" +
      "yProto\022\024\n\014clusterCount\030\001 \001(\005\022\023\n\013computeC" +
      "ost\030\002 \001(\003\022\024\n\014creationTime\030\003 \001(\003\022\023\n\013devic" +
      "eCount\030\004 \001(\005\022\021\n\tlinkCount\030\005 \001(\005\022\014\n\004time\030" +
      "\006 \001(\003B\035\n\033org.onosproject.grpc.modelsb\006pr" +
      "oto3"
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
    internal_static_proto_TopologyProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_TopologyProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_TopologyProto_descriptor,
        new java.lang.String[] { "ClusterCount", "ComputeCost", "CreationTime", "DeviceCount", "LinkCount", "Time", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
