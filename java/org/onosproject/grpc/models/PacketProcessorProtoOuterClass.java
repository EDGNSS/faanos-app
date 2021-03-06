// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacketProcessorProto.proto

package org.onosproject.grpc.models;

public final class PacketProcessorProtoOuterClass {
  private PacketProcessorProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PacketProcessorProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PacketProcessorProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 priority = 1;</code>
     */
    int getPriority();
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.packet.PacketProcessor.
   * </pre>
   *
   * Protobuf type {@code proto.PacketProcessorProto}
   */
  public  static final class PacketProcessorProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.PacketProcessorProto)
      PacketProcessorProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PacketProcessorProto.newBuilder() to construct.
    private PacketProcessorProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PacketProcessorProto() {
      priority_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PacketProcessorProto(
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

              priority_ = input.readInt32();
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
      return org.onosproject.grpc.models.PacketProcessorProtoOuterClass.internal_static_proto_PacketProcessorProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.PacketProcessorProtoOuterClass.internal_static_proto_PacketProcessorProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.class, org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.Builder.class);
    }

    public static final int PRIORITY_FIELD_NUMBER = 1;
    private int priority_;
    /**
     * <code>int32 priority = 1;</code>
     */
    public int getPriority() {
      return priority_;
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
      if (priority_ != 0) {
        output.writeInt32(1, priority_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (priority_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, priority_);
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
      if (!(obj instanceof org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto other = (org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto) obj;

      boolean result = true;
      result = result && (getPriority()
          == other.getPriority());
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
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getPriority();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto prototype) {
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
     * Corresponds to org.onosproject.net.packet.PacketProcessor.
     * </pre>
     *
     * Protobuf type {@code proto.PacketProcessorProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PacketProcessorProto)
        org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.PacketProcessorProtoOuterClass.internal_static_proto_PacketProcessorProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.PacketProcessorProtoOuterClass.internal_static_proto_PacketProcessorProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.class, org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.newBuilder()
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
        priority_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.PacketProcessorProtoOuterClass.internal_static_proto_PacketProcessorProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto build() {
        org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto buildPartial() {
        org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto result = new org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto(this);
        result.priority_ = priority_;
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
        if (other instanceof org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto) {
          return mergeFrom((org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto other) {
        if (other == org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto.getDefaultInstance()) return this;
        if (other.getPriority() != 0) {
          setPriority(other.getPriority());
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
        org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int priority_ ;
      /**
       * <code>int32 priority = 1;</code>
       */
      public int getPriority() {
        return priority_;
      }
      /**
       * <code>int32 priority = 1;</code>
       */
      public Builder setPriority(int value) {
        
        priority_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 priority = 1;</code>
       */
      public Builder clearPriority() {
        
        priority_ = 0;
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


      // @@protoc_insertion_point(builder_scope:proto.PacketProcessorProto)
    }

    // @@protoc_insertion_point(class_scope:proto.PacketProcessorProto)
    private static final org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto();
    }

    public static org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PacketProcessorProto>
        PARSER = new com.google.protobuf.AbstractParser<PacketProcessorProto>() {
      @java.lang.Override
      public PacketProcessorProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PacketProcessorProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PacketProcessorProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PacketProcessorProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.PacketProcessorProtoOuterClass.PacketProcessorProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PacketProcessorProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PacketProcessorProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PacketProcessorProto.proto\022\005proto\"(\n\024P" +
      "acketProcessorProto\022\020\n\010priority\030\001 \001(\005B\035\n" +
      "\033org.onosproject.grpc.modelsb\006proto3"
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
    internal_static_proto_PacketProcessorProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PacketProcessorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PacketProcessorProto_descriptor,
        new java.lang.String[] { "Priority", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
