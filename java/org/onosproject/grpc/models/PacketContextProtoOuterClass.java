// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacketContextProto.proto

package org.onosproject.grpc.models;

public final class PacketContextProtoOuterClass {
  private PacketContextProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PacketContextProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PacketContextProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
     */
    boolean hasInboundPacket();
    /**
     * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
     */
    org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto getInboundPacket();
    /**
     * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
     */
    org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProtoOrBuilder getInboundPacketOrBuilder();

    /**
     * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
     */
    boolean hasOutboundPacket();
    /**
     * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
     */
    org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto getOutboundPacket();
    /**
     * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
     */
    org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder getOutboundPacketOrBuilder();

    /**
     * <code>int64 time = 3;</code>
     */
    long getTime();
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.packet.PacketContext.
   * </pre>
   *
   * Protobuf type {@code proto.PacketContextProto}
   */
  public  static final class PacketContextProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.PacketContextProto)
      PacketContextProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PacketContextProto.newBuilder() to construct.
    private PacketContextProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PacketContextProto() {
      time_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PacketContextProto(
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
              org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.Builder subBuilder = null;
              if (inboundPacket_ != null) {
                subBuilder = inboundPacket_.toBuilder();
              }
              inboundPacket_ = input.readMessage(org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inboundPacket_);
                inboundPacket_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder subBuilder = null;
              if (outboundPacket_ != null) {
                subBuilder = outboundPacket_.toBuilder();
              }
              outboundPacket_ = input.readMessage(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(outboundPacket_);
                outboundPacket_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

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
      return org.onosproject.grpc.models.PacketContextProtoOuterClass.internal_static_proto_PacketContextProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.PacketContextProtoOuterClass.internal_static_proto_PacketContextProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.class, org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.Builder.class);
    }

    public static final int INBOUNDPACKET_FIELD_NUMBER = 1;
    private org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto inboundPacket_;
    /**
     * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
     */
    public boolean hasInboundPacket() {
      return inboundPacket_ != null;
    }
    /**
     * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
     */
    public org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto getInboundPacket() {
      return inboundPacket_ == null ? org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.getDefaultInstance() : inboundPacket_;
    }
    /**
     * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
     */
    public org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProtoOrBuilder getInboundPacketOrBuilder() {
      return getInboundPacket();
    }

    public static final int OUTBOUNDPACKET_FIELD_NUMBER = 2;
    private org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto outboundPacket_;
    /**
     * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
     */
    public boolean hasOutboundPacket() {
      return outboundPacket_ != null;
    }
    /**
     * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
     */
    public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto getOutboundPacket() {
      return outboundPacket_ == null ? org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance() : outboundPacket_;
    }
    /**
     * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
     */
    public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder getOutboundPacketOrBuilder() {
      return getOutboundPacket();
    }

    public static final int TIME_FIELD_NUMBER = 3;
    private long time_;
    /**
     * <code>int64 time = 3;</code>
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
      if (inboundPacket_ != null) {
        output.writeMessage(1, getInboundPacket());
      }
      if (outboundPacket_ != null) {
        output.writeMessage(2, getOutboundPacket());
      }
      if (time_ != 0L) {
        output.writeInt64(3, time_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (inboundPacket_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getInboundPacket());
      }
      if (outboundPacket_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getOutboundPacket());
      }
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, time_);
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
      if (!(obj instanceof org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto other = (org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto) obj;

      boolean result = true;
      result = result && (hasInboundPacket() == other.hasInboundPacket());
      if (hasInboundPacket()) {
        result = result && getInboundPacket()
            .equals(other.getInboundPacket());
      }
      result = result && (hasOutboundPacket() == other.hasOutboundPacket());
      if (hasOutboundPacket()) {
        result = result && getOutboundPacket()
            .equals(other.getOutboundPacket());
      }
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
      if (hasInboundPacket()) {
        hash = (37 * hash) + INBOUNDPACKET_FIELD_NUMBER;
        hash = (53 * hash) + getInboundPacket().hashCode();
      }
      if (hasOutboundPacket()) {
        hash = (37 * hash) + OUTBOUNDPACKET_FIELD_NUMBER;
        hash = (53 * hash) + getOutboundPacket().hashCode();
      }
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto prototype) {
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
     * Corresponds to org.onosproject.net.packet.PacketContext.
     * </pre>
     *
     * Protobuf type {@code proto.PacketContextProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PacketContextProto)
        org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.PacketContextProtoOuterClass.internal_static_proto_PacketContextProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.PacketContextProtoOuterClass.internal_static_proto_PacketContextProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.class, org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.newBuilder()
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
        if (inboundPacketBuilder_ == null) {
          inboundPacket_ = null;
        } else {
          inboundPacket_ = null;
          inboundPacketBuilder_ = null;
        }
        if (outboundPacketBuilder_ == null) {
          outboundPacket_ = null;
        } else {
          outboundPacket_ = null;
          outboundPacketBuilder_ = null;
        }
        time_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.PacketContextProtoOuterClass.internal_static_proto_PacketContextProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto build() {
        org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto buildPartial() {
        org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto result = new org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto(this);
        if (inboundPacketBuilder_ == null) {
          result.inboundPacket_ = inboundPacket_;
        } else {
          result.inboundPacket_ = inboundPacketBuilder_.build();
        }
        if (outboundPacketBuilder_ == null) {
          result.outboundPacket_ = outboundPacket_;
        } else {
          result.outboundPacket_ = outboundPacketBuilder_.build();
        }
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
        if (other instanceof org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto) {
          return mergeFrom((org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto other) {
        if (other == org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto.getDefaultInstance()) return this;
        if (other.hasInboundPacket()) {
          mergeInboundPacket(other.getInboundPacket());
        }
        if (other.hasOutboundPacket()) {
          mergeOutboundPacket(other.getOutboundPacket());
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
        org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto inboundPacket_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto, org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.Builder, org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProtoOrBuilder> inboundPacketBuilder_;
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public boolean hasInboundPacket() {
        return inboundPacketBuilder_ != null || inboundPacket_ != null;
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto getInboundPacket() {
        if (inboundPacketBuilder_ == null) {
          return inboundPacket_ == null ? org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.getDefaultInstance() : inboundPacket_;
        } else {
          return inboundPacketBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public Builder setInboundPacket(org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto value) {
        if (inboundPacketBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          inboundPacket_ = value;
          onChanged();
        } else {
          inboundPacketBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public Builder setInboundPacket(
          org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.Builder builderForValue) {
        if (inboundPacketBuilder_ == null) {
          inboundPacket_ = builderForValue.build();
          onChanged();
        } else {
          inboundPacketBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public Builder mergeInboundPacket(org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto value) {
        if (inboundPacketBuilder_ == null) {
          if (inboundPacket_ != null) {
            inboundPacket_ =
              org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.newBuilder(inboundPacket_).mergeFrom(value).buildPartial();
          } else {
            inboundPacket_ = value;
          }
          onChanged();
        } else {
          inboundPacketBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public Builder clearInboundPacket() {
        if (inboundPacketBuilder_ == null) {
          inboundPacket_ = null;
          onChanged();
        } else {
          inboundPacket_ = null;
          inboundPacketBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.Builder getInboundPacketBuilder() {
        
        onChanged();
        return getInboundPacketFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      public org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProtoOrBuilder getInboundPacketOrBuilder() {
        if (inboundPacketBuilder_ != null) {
          return inboundPacketBuilder_.getMessageOrBuilder();
        } else {
          return inboundPacket_ == null ?
              org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.getDefaultInstance() : inboundPacket_;
        }
      }
      /**
       * <code>.proto.InboundPacketProto inboundPacket = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto, org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.Builder, org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProtoOrBuilder> 
          getInboundPacketFieldBuilder() {
        if (inboundPacketBuilder_ == null) {
          inboundPacketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto, org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto.Builder, org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProtoOrBuilder>(
                  getInboundPacket(),
                  getParentForChildren(),
                  isClean());
          inboundPacket_ = null;
        }
        return inboundPacketBuilder_;
      }

      private org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto outboundPacket_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder> outboundPacketBuilder_;
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public boolean hasOutboundPacket() {
        return outboundPacketBuilder_ != null || outboundPacket_ != null;
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto getOutboundPacket() {
        if (outboundPacketBuilder_ == null) {
          return outboundPacket_ == null ? org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance() : outboundPacket_;
        } else {
          return outboundPacketBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public Builder setOutboundPacket(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto value) {
        if (outboundPacketBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          outboundPacket_ = value;
          onChanged();
        } else {
          outboundPacketBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public Builder setOutboundPacket(
          org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder builderForValue) {
        if (outboundPacketBuilder_ == null) {
          outboundPacket_ = builderForValue.build();
          onChanged();
        } else {
          outboundPacketBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public Builder mergeOutboundPacket(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto value) {
        if (outboundPacketBuilder_ == null) {
          if (outboundPacket_ != null) {
            outboundPacket_ =
              org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.newBuilder(outboundPacket_).mergeFrom(value).buildPartial();
          } else {
            outboundPacket_ = value;
          }
          onChanged();
        } else {
          outboundPacketBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public Builder clearOutboundPacket() {
        if (outboundPacketBuilder_ == null) {
          outboundPacket_ = null;
          onChanged();
        } else {
          outboundPacket_ = null;
          outboundPacketBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder getOutboundPacketBuilder() {
        
        onChanged();
        return getOutboundPacketFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder getOutboundPacketOrBuilder() {
        if (outboundPacketBuilder_ != null) {
          return outboundPacketBuilder_.getMessageOrBuilder();
        } else {
          return outboundPacket_ == null ?
              org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance() : outboundPacket_;
        }
      }
      /**
       * <code>.proto.OutboundPacketProto outboundPacket = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder> 
          getOutboundPacketFieldBuilder() {
        if (outboundPacketBuilder_ == null) {
          outboundPacketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder>(
                  getOutboundPacket(),
                  getParentForChildren(),
                  isClean());
          outboundPacket_ = null;
        }
        return outboundPacketBuilder_;
      }

      private long time_ ;
      /**
       * <code>int64 time = 3;</code>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>int64 time = 3;</code>
       */
      public Builder setTime(long value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 time = 3;</code>
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


      // @@protoc_insertion_point(builder_scope:proto.PacketContextProto)
    }

    // @@protoc_insertion_point(class_scope:proto.PacketContextProto)
    private static final org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto();
    }

    public static org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PacketContextProto>
        PARSER = new com.google.protobuf.AbstractParser<PacketContextProto>() {
      @java.lang.Override
      public PacketContextProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PacketContextProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PacketContextProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PacketContextProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PacketContextProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PacketContextProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PacketContextProto.proto\022\005proto\032\031Outbo" +
      "undPacketProto.proto\032\030InboundPacketProto" +
      ".proto\"\210\001\n\022PacketContextProto\0220\n\rinbound" +
      "Packet\030\001 \001(\0132\031.proto.InboundPacketProto\022" +
      "2\n\016outboundPacket\030\002 \001(\0132\032.proto.Outbound" +
      "PacketProto\022\014\n\004time\030\003 \001(\003B\035\n\033org.onospro" +
      "ject.grpc.modelsb\006proto3"
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
          org.onosproject.grpc.models.OutboundPacketProtoOuterClass.getDescriptor(),
          org.onosproject.grpc.models.InboundPacketProtoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_proto_PacketContextProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PacketContextProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PacketContextProto_descriptor,
        new java.lang.String[] { "InboundPacket", "OutboundPacket", "Time", });
    org.onosproject.grpc.models.OutboundPacketProtoOuterClass.getDescriptor();
    org.onosproject.grpc.models.InboundPacketProtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
