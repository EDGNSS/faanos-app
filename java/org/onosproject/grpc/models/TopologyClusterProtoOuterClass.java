// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TopologyClusterProto.proto

package org.onosproject.grpc.models;

public final class TopologyClusterProtoOuterClass {
  private TopologyClusterProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TopologyClusterProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.TopologyClusterProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 deviceCount = 1;</code>
     */
    int getDeviceCount();

    /**
     * <code>.proto.ClusterIdProto clusterId = 2;</code>
     */
    boolean hasClusterId();
    /**
     * <code>.proto.ClusterIdProto clusterId = 2;</code>
     */
    org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto getClusterId();
    /**
     * <code>.proto.ClusterIdProto clusterId = 2;</code>
     */
    org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProtoOrBuilder getClusterIdOrBuilder();

    /**
     * <code>int32 linkCount = 3;</code>
     */
    int getLinkCount();

    /**
     * <code>.proto.TopologyVertexProto root = 4;</code>
     */
    boolean hasRoot();
    /**
     * <code>.proto.TopologyVertexProto root = 4;</code>
     */
    org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto getRoot();
    /**
     * <code>.proto.TopologyVertexProto root = 4;</code>
     */
    org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProtoOrBuilder getRootOrBuilder();
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.topology.TopologyCluster
   * </pre>
   *
   * Protobuf type {@code proto.TopologyClusterProto}
   */
  public  static final class TopologyClusterProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.TopologyClusterProto)
      TopologyClusterProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TopologyClusterProto.newBuilder() to construct.
    private TopologyClusterProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TopologyClusterProto() {
      deviceCount_ = 0;
      linkCount_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TopologyClusterProto(
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

              deviceCount_ = input.readInt32();
              break;
            }
            case 18: {
              org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.Builder subBuilder = null;
              if (clusterId_ != null) {
                subBuilder = clusterId_.toBuilder();
              }
              clusterId_ = input.readMessage(org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(clusterId_);
                clusterId_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

              linkCount_ = input.readInt32();
              break;
            }
            case 34: {
              org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.Builder subBuilder = null;
              if (root_ != null) {
                subBuilder = root_.toBuilder();
              }
              root_ = input.readMessage(org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(root_);
                root_ = subBuilder.buildPartial();
              }

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
      return org.onosproject.grpc.models.TopologyClusterProtoOuterClass.internal_static_proto_TopologyClusterProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.TopologyClusterProtoOuterClass.internal_static_proto_TopologyClusterProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.class, org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.Builder.class);
    }

    public static final int DEVICECOUNT_FIELD_NUMBER = 1;
    private int deviceCount_;
    /**
     * <code>int32 deviceCount = 1;</code>
     */
    public int getDeviceCount() {
      return deviceCount_;
    }

    public static final int CLUSTERID_FIELD_NUMBER = 2;
    private org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto clusterId_;
    /**
     * <code>.proto.ClusterIdProto clusterId = 2;</code>
     */
    public boolean hasClusterId() {
      return clusterId_ != null;
    }
    /**
     * <code>.proto.ClusterIdProto clusterId = 2;</code>
     */
    public org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto getClusterId() {
      return clusterId_ == null ? org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.getDefaultInstance() : clusterId_;
    }
    /**
     * <code>.proto.ClusterIdProto clusterId = 2;</code>
     */
    public org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProtoOrBuilder getClusterIdOrBuilder() {
      return getClusterId();
    }

    public static final int LINKCOUNT_FIELD_NUMBER = 3;
    private int linkCount_;
    /**
     * <code>int32 linkCount = 3;</code>
     */
    public int getLinkCount() {
      return linkCount_;
    }

    public static final int ROOT_FIELD_NUMBER = 4;
    private org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto root_;
    /**
     * <code>.proto.TopologyVertexProto root = 4;</code>
     */
    public boolean hasRoot() {
      return root_ != null;
    }
    /**
     * <code>.proto.TopologyVertexProto root = 4;</code>
     */
    public org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto getRoot() {
      return root_ == null ? org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.getDefaultInstance() : root_;
    }
    /**
     * <code>.proto.TopologyVertexProto root = 4;</code>
     */
    public org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProtoOrBuilder getRootOrBuilder() {
      return getRoot();
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
      if (deviceCount_ != 0) {
        output.writeInt32(1, deviceCount_);
      }
      if (clusterId_ != null) {
        output.writeMessage(2, getClusterId());
      }
      if (linkCount_ != 0) {
        output.writeInt32(3, linkCount_);
      }
      if (root_ != null) {
        output.writeMessage(4, getRoot());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (deviceCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, deviceCount_);
      }
      if (clusterId_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getClusterId());
      }
      if (linkCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, linkCount_);
      }
      if (root_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getRoot());
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
      if (!(obj instanceof org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto other = (org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto) obj;

      boolean result = true;
      result = result && (getDeviceCount()
          == other.getDeviceCount());
      result = result && (hasClusterId() == other.hasClusterId());
      if (hasClusterId()) {
        result = result && getClusterId()
            .equals(other.getClusterId());
      }
      result = result && (getLinkCount()
          == other.getLinkCount());
      result = result && (hasRoot() == other.hasRoot());
      if (hasRoot()) {
        result = result && getRoot()
            .equals(other.getRoot());
      }
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
      hash = (37 * hash) + DEVICECOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceCount();
      if (hasClusterId()) {
        hash = (37 * hash) + CLUSTERID_FIELD_NUMBER;
        hash = (53 * hash) + getClusterId().hashCode();
      }
      hash = (37 * hash) + LINKCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getLinkCount();
      if (hasRoot()) {
        hash = (37 * hash) + ROOT_FIELD_NUMBER;
        hash = (53 * hash) + getRoot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto prototype) {
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
     * Corresponds to org.onosproject.net.topology.TopologyCluster
     * </pre>
     *
     * Protobuf type {@code proto.TopologyClusterProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.TopologyClusterProto)
        org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.TopologyClusterProtoOuterClass.internal_static_proto_TopologyClusterProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.TopologyClusterProtoOuterClass.internal_static_proto_TopologyClusterProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.class, org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.newBuilder()
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
        deviceCount_ = 0;

        if (clusterIdBuilder_ == null) {
          clusterId_ = null;
        } else {
          clusterId_ = null;
          clusterIdBuilder_ = null;
        }
        linkCount_ = 0;

        if (rootBuilder_ == null) {
          root_ = null;
        } else {
          root_ = null;
          rootBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.TopologyClusterProtoOuterClass.internal_static_proto_TopologyClusterProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto build() {
        org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto buildPartial() {
        org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto result = new org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto(this);
        result.deviceCount_ = deviceCount_;
        if (clusterIdBuilder_ == null) {
          result.clusterId_ = clusterId_;
        } else {
          result.clusterId_ = clusterIdBuilder_.build();
        }
        result.linkCount_ = linkCount_;
        if (rootBuilder_ == null) {
          result.root_ = root_;
        } else {
          result.root_ = rootBuilder_.build();
        }
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
        if (other instanceof org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto) {
          return mergeFrom((org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto other) {
        if (other == org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto.getDefaultInstance()) return this;
        if (other.getDeviceCount() != 0) {
          setDeviceCount(other.getDeviceCount());
        }
        if (other.hasClusterId()) {
          mergeClusterId(other.getClusterId());
        }
        if (other.getLinkCount() != 0) {
          setLinkCount(other.getLinkCount());
        }
        if (other.hasRoot()) {
          mergeRoot(other.getRoot());
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
        org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int deviceCount_ ;
      /**
       * <code>int32 deviceCount = 1;</code>
       */
      public int getDeviceCount() {
        return deviceCount_;
      }
      /**
       * <code>int32 deviceCount = 1;</code>
       */
      public Builder setDeviceCount(int value) {
        
        deviceCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 deviceCount = 1;</code>
       */
      public Builder clearDeviceCount() {
        
        deviceCount_ = 0;
        onChanged();
        return this;
      }

      private org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto clusterId_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto, org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.Builder, org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProtoOrBuilder> clusterIdBuilder_;
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public boolean hasClusterId() {
        return clusterIdBuilder_ != null || clusterId_ != null;
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto getClusterId() {
        if (clusterIdBuilder_ == null) {
          return clusterId_ == null ? org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.getDefaultInstance() : clusterId_;
        } else {
          return clusterIdBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public Builder setClusterId(org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto value) {
        if (clusterIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          clusterId_ = value;
          onChanged();
        } else {
          clusterIdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public Builder setClusterId(
          org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.Builder builderForValue) {
        if (clusterIdBuilder_ == null) {
          clusterId_ = builderForValue.build();
          onChanged();
        } else {
          clusterIdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public Builder mergeClusterId(org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto value) {
        if (clusterIdBuilder_ == null) {
          if (clusterId_ != null) {
            clusterId_ =
              org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.newBuilder(clusterId_).mergeFrom(value).buildPartial();
          } else {
            clusterId_ = value;
          }
          onChanged();
        } else {
          clusterIdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public Builder clearClusterId() {
        if (clusterIdBuilder_ == null) {
          clusterId_ = null;
          onChanged();
        } else {
          clusterId_ = null;
          clusterIdBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.Builder getClusterIdBuilder() {
        
        onChanged();
        return getClusterIdFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      public org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProtoOrBuilder getClusterIdOrBuilder() {
        if (clusterIdBuilder_ != null) {
          return clusterIdBuilder_.getMessageOrBuilder();
        } else {
          return clusterId_ == null ?
              org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.getDefaultInstance() : clusterId_;
        }
      }
      /**
       * <code>.proto.ClusterIdProto clusterId = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto, org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.Builder, org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProtoOrBuilder> 
          getClusterIdFieldBuilder() {
        if (clusterIdBuilder_ == null) {
          clusterIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto, org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProto.Builder, org.onosproject.grpc.models.ClusterIdProtoOuterClass.ClusterIdProtoOrBuilder>(
                  getClusterId(),
                  getParentForChildren(),
                  isClean());
          clusterId_ = null;
        }
        return clusterIdBuilder_;
      }

      private int linkCount_ ;
      /**
       * <code>int32 linkCount = 3;</code>
       */
      public int getLinkCount() {
        return linkCount_;
      }
      /**
       * <code>int32 linkCount = 3;</code>
       */
      public Builder setLinkCount(int value) {
        
        linkCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 linkCount = 3;</code>
       */
      public Builder clearLinkCount() {
        
        linkCount_ = 0;
        onChanged();
        return this;
      }

      private org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto root_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto, org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.Builder, org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProtoOrBuilder> rootBuilder_;
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public boolean hasRoot() {
        return rootBuilder_ != null || root_ != null;
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto getRoot() {
        if (rootBuilder_ == null) {
          return root_ == null ? org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.getDefaultInstance() : root_;
        } else {
          return rootBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public Builder setRoot(org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto value) {
        if (rootBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          root_ = value;
          onChanged();
        } else {
          rootBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public Builder setRoot(
          org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.Builder builderForValue) {
        if (rootBuilder_ == null) {
          root_ = builderForValue.build();
          onChanged();
        } else {
          rootBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public Builder mergeRoot(org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto value) {
        if (rootBuilder_ == null) {
          if (root_ != null) {
            root_ =
              org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.newBuilder(root_).mergeFrom(value).buildPartial();
          } else {
            root_ = value;
          }
          onChanged();
        } else {
          rootBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public Builder clearRoot() {
        if (rootBuilder_ == null) {
          root_ = null;
          onChanged();
        } else {
          root_ = null;
          rootBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.Builder getRootBuilder() {
        
        onChanged();
        return getRootFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      public org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProtoOrBuilder getRootOrBuilder() {
        if (rootBuilder_ != null) {
          return rootBuilder_.getMessageOrBuilder();
        } else {
          return root_ == null ?
              org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.getDefaultInstance() : root_;
        }
      }
      /**
       * <code>.proto.TopologyVertexProto root = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto, org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.Builder, org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProtoOrBuilder> 
          getRootFieldBuilder() {
        if (rootBuilder_ == null) {
          rootBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto, org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProto.Builder, org.onosproject.grpc.models.TopologyVertexProtoOuterClass.TopologyVertexProtoOrBuilder>(
                  getRoot(),
                  getParentForChildren(),
                  isClean());
          root_ = null;
        }
        return rootBuilder_;
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


      // @@protoc_insertion_point(builder_scope:proto.TopologyClusterProto)
    }

    // @@protoc_insertion_point(class_scope:proto.TopologyClusterProto)
    private static final org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto();
    }

    public static org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TopologyClusterProto>
        PARSER = new com.google.protobuf.AbstractParser<TopologyClusterProto>() {
      @java.lang.Override
      public TopologyClusterProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TopologyClusterProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TopologyClusterProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TopologyClusterProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.TopologyClusterProtoOuterClass.TopologyClusterProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_TopologyClusterProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_TopologyClusterProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TopologyClusterProto.proto\022\005proto\032\024Clu" +
      "sterIdProto.proto\032\031TopologyVertexProto.p" +
      "roto\"\222\001\n\024TopologyClusterProto\022\023\n\013deviceC" +
      "ount\030\001 \001(\005\022(\n\tclusterId\030\002 \001(\0132\025.proto.Cl" +
      "usterIdProto\022\021\n\tlinkCount\030\003 \001(\005\022(\n\004root\030" +
      "\004 \001(\0132\032.proto.TopologyVertexProtoB\035\n\033org" +
      ".onosproject.grpc.modelsb\006proto3"
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
          org.onosproject.grpc.models.ClusterIdProtoOuterClass.getDescriptor(),
          org.onosproject.grpc.models.TopologyVertexProtoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_proto_TopologyClusterProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_TopologyClusterProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_TopologyClusterProto_descriptor,
        new java.lang.String[] { "DeviceCount", "ClusterId", "LinkCount", "Root", });
    org.onosproject.grpc.models.ClusterIdProtoOuterClass.getDescriptor();
    org.onosproject.grpc.models.TopologyVertexProtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
