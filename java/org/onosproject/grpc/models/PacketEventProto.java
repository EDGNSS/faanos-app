// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacketEventProto.proto

package org.onosproject.grpc.models;

public final class PacketEventProto {
  private PacketEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PacketNotificationProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PacketNotificationProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
     */
    boolean hasOutboundPacket();
    /**
     * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
     */
    org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto getOutboundPacket();
    /**
     * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
     */
    org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder getOutboundPacketOrBuilder();

    /**
     * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
     */
    int getPacketEventTypeValue();
    /**
     * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
     */
    org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto getPacketEventType();
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.packet.PacketEvent.
   * </pre>
   *
   * Protobuf type {@code proto.PacketNotificationProto}
   */
  public  static final class PacketNotificationProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.PacketNotificationProto)
      PacketNotificationProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PacketNotificationProto.newBuilder() to construct.
    private PacketNotificationProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PacketNotificationProto() {
      packetEventType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PacketNotificationProto(
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
            case 16: {
              int rawValue = input.readEnum();

              packetEventType_ = rawValue;
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
      return org.onosproject.grpc.models.PacketEventProto.internal_static_proto_PacketNotificationProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.PacketEventProto.internal_static_proto_PacketNotificationProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.class, org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.Builder.class);
    }

    public static final int OUTBOUND_PACKET_FIELD_NUMBER = 1;
    private org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto outboundPacket_;
    /**
     * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
     */
    public boolean hasOutboundPacket() {
      return outboundPacket_ != null;
    }
    /**
     * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
     */
    public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto getOutboundPacket() {
      return outboundPacket_ == null ? org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance() : outboundPacket_;
    }
    /**
     * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
     */
    public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder getOutboundPacketOrBuilder() {
      return getOutboundPacket();
    }

    public static final int PACKET_EVENT_TYPE_FIELD_NUMBER = 2;
    private int packetEventType_;
    /**
     * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
     */
    public int getPacketEventTypeValue() {
      return packetEventType_;
    }
    /**
     * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
     */
    public org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto getPacketEventType() {
      @SuppressWarnings("deprecation")
      org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto result = org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto.valueOf(packetEventType_);
      return result == null ? org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto.UNRECOGNIZED : result;
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
      if (outboundPacket_ != null) {
        output.writeMessage(1, getOutboundPacket());
      }
      if (packetEventType_ != org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto.EMIT.getNumber()) {
        output.writeEnum(2, packetEventType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (outboundPacket_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getOutboundPacket());
      }
      if (packetEventType_ != org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto.EMIT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, packetEventType_);
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
      if (!(obj instanceof org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto other = (org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto) obj;

      boolean result = true;
      result = result && (hasOutboundPacket() == other.hasOutboundPacket());
      if (hasOutboundPacket()) {
        result = result && getOutboundPacket()
            .equals(other.getOutboundPacket());
      }
      result = result && packetEventType_ == other.packetEventType_;
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
      if (hasOutboundPacket()) {
        hash = (37 * hash) + OUTBOUND_PACKET_FIELD_NUMBER;
        hash = (53 * hash) + getOutboundPacket().hashCode();
      }
      hash = (37 * hash) + PACKET_EVENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + packetEventType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto prototype) {
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
     * Corresponds to org.onosproject.net.packet.PacketEvent.
     * </pre>
     *
     * Protobuf type {@code proto.PacketNotificationProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PacketNotificationProto)
        org.onosproject.grpc.models.PacketEventProto.PacketNotificationProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.PacketEventProto.internal_static_proto_PacketNotificationProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.PacketEventProto.internal_static_proto_PacketNotificationProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.class, org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.newBuilder()
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
        if (outboundPacketBuilder_ == null) {
          outboundPacket_ = null;
        } else {
          outboundPacket_ = null;
          outboundPacketBuilder_ = null;
        }
        packetEventType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.PacketEventProto.internal_static_proto_PacketNotificationProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto build() {
        org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto buildPartial() {
        org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto result = new org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto(this);
        if (outboundPacketBuilder_ == null) {
          result.outboundPacket_ = outboundPacket_;
        } else {
          result.outboundPacket_ = outboundPacketBuilder_.build();
        }
        result.packetEventType_ = packetEventType_;
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
        if (other instanceof org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto) {
          return mergeFrom((org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto other) {
        if (other == org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto.getDefaultInstance()) return this;
        if (other.hasOutboundPacket()) {
          mergeOutboundPacket(other.getOutboundPacket());
        }
        if (other.packetEventType_ != 0) {
          setPacketEventTypeValue(other.getPacketEventTypeValue());
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
        org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto outboundPacket_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder, org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProtoOrBuilder> outboundPacketBuilder_;
      /**
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
       */
      public boolean hasOutboundPacket() {
        return outboundPacketBuilder_ != null || outboundPacket_ != null;
      }
      /**
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
       */
      public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto getOutboundPacket() {
        if (outboundPacketBuilder_ == null) {
          return outboundPacket_ == null ? org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance() : outboundPacket_;
        } else {
          return outboundPacketBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
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
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
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
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
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
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
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
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
       */
      public org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.Builder getOutboundPacketBuilder() {
        
        onChanged();
        return getOutboundPacketFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
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
       * <code>.proto.OutboundPacketProto outbound_packet = 1;</code>
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

      private int packetEventType_ = 0;
      /**
       * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
       */
      public int getPacketEventTypeValue() {
        return packetEventType_;
      }
      /**
       * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
       */
      public Builder setPacketEventTypeValue(int value) {
        packetEventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
       */
      public org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto getPacketEventType() {
        @SuppressWarnings("deprecation")
        org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto result = org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto.valueOf(packetEventType_);
        return result == null ? org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto.UNRECOGNIZED : result;
      }
      /**
       * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
       */
      public Builder setPacketEventType(org.onosproject.grpc.models.PacketEnumsProto.PacketEventTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        packetEventType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.proto.PacketEventTypeProto packet_event_type = 2;</code>
       */
      public Builder clearPacketEventType() {
        
        packetEventType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:proto.PacketNotificationProto)
    }

    // @@protoc_insertion_point(class_scope:proto.PacketNotificationProto)
    private static final org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto();
    }

    public static org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PacketNotificationProto>
        PARSER = new com.google.protobuf.AbstractParser<PacketNotificationProto>() {
      @java.lang.Override
      public PacketNotificationProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PacketNotificationProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PacketNotificationProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PacketNotificationProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.PacketEventProto.PacketNotificationProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PacketNotificationProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PacketNotificationProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PacketEventProto.proto\022\005proto\032\031Outboun" +
      "dPacketProto.proto\032\026PacketEnumsProto.pro" +
      "to\"\206\001\n\027PacketNotificationProto\0223\n\017outbou" +
      "nd_packet\030\001 \001(\0132\032.proto.OutboundPacketPr" +
      "oto\0226\n\021packet_event_type\030\002 \001(\0162\033.proto.P" +
      "acketEventTypeProtoB\035\n\033org.onosproject.g" +
      "rpc.modelsb\006proto3"
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
          org.onosproject.grpc.models.PacketEnumsProto.getDescriptor(),
        }, assigner);
    internal_static_proto_PacketNotificationProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PacketNotificationProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PacketNotificationProto_descriptor,
        new java.lang.String[] { "OutboundPacket", "PacketEventType", });
    org.onosproject.grpc.models.OutboundPacketProtoOuterClass.getDescriptor();
    org.onosproject.grpc.models.PacketEnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
