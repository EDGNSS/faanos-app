// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TopologyEdgeProto.proto

package org.onosproject.grpc.models;

public final class TopologyEdgeProtoOuterClass {
  private TopologyEdgeProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TopologyEdgeProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.TopologyEdgeProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.LinkProto link = 1;</code>
     */
    boolean hasLink();
    /**
     * <code>.proto.LinkProto link = 1;</code>
     */
    org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto getLink();
    /**
     * <code>.proto.LinkProto link = 1;</code>
     */
    org.onosproject.grpc.models.LinkProtoOuterClass.LinkProtoOrBuilder getLinkOrBuilder();
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.topology.TopologyEdge
   * </pre>
   *
   * Protobuf type {@code proto.TopologyEdgeProto}
   */
  public  static final class TopologyEdgeProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.TopologyEdgeProto)
      TopologyEdgeProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TopologyEdgeProto.newBuilder() to construct.
    private TopologyEdgeProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TopologyEdgeProto() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TopologyEdgeProto(
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
              org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.Builder subBuilder = null;
              if (link_ != null) {
                subBuilder = link_.toBuilder();
              }
              link_ = input.readMessage(org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(link_);
                link_ = subBuilder.buildPartial();
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
      return org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.internal_static_proto_TopologyEdgeProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.internal_static_proto_TopologyEdgeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.class, org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.Builder.class);
    }

    public static final int LINK_FIELD_NUMBER = 1;
    private org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto link_;
    /**
     * <code>.proto.LinkProto link = 1;</code>
     */
    public boolean hasLink() {
      return link_ != null;
    }
    /**
     * <code>.proto.LinkProto link = 1;</code>
     */
    public org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto getLink() {
      return link_ == null ? org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.getDefaultInstance() : link_;
    }
    /**
     * <code>.proto.LinkProto link = 1;</code>
     */
    public org.onosproject.grpc.models.LinkProtoOuterClass.LinkProtoOrBuilder getLinkOrBuilder() {
      return getLink();
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
      if (link_ != null) {
        output.writeMessage(1, getLink());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (link_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getLink());
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
      if (!(obj instanceof org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto other = (org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto) obj;

      boolean result = true;
      result = result && (hasLink() == other.hasLink());
      if (hasLink()) {
        result = result && getLink()
            .equals(other.getLink());
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
      if (hasLink()) {
        hash = (37 * hash) + LINK_FIELD_NUMBER;
        hash = (53 * hash) + getLink().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto prototype) {
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
     * Corresponds to org.onosproject.net.topology.TopologyEdge
     * </pre>
     *
     * Protobuf type {@code proto.TopologyEdgeProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.TopologyEdgeProto)
        org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.internal_static_proto_TopologyEdgeProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.internal_static_proto_TopologyEdgeProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.class, org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.newBuilder()
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
        if (linkBuilder_ == null) {
          link_ = null;
        } else {
          link_ = null;
          linkBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.internal_static_proto_TopologyEdgeProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto build() {
        org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto buildPartial() {
        org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto result = new org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto(this);
        if (linkBuilder_ == null) {
          result.link_ = link_;
        } else {
          result.link_ = linkBuilder_.build();
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
        if (other instanceof org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto) {
          return mergeFrom((org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto other) {
        if (other == org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto.getDefaultInstance()) return this;
        if (other.hasLink()) {
          mergeLink(other.getLink());
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
        org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto link_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto, org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.Builder, org.onosproject.grpc.models.LinkProtoOuterClass.LinkProtoOrBuilder> linkBuilder_;
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public boolean hasLink() {
        return linkBuilder_ != null || link_ != null;
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto getLink() {
        if (linkBuilder_ == null) {
          return link_ == null ? org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.getDefaultInstance() : link_;
        } else {
          return linkBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public Builder setLink(org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto value) {
        if (linkBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          link_ = value;
          onChanged();
        } else {
          linkBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public Builder setLink(
          org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.Builder builderForValue) {
        if (linkBuilder_ == null) {
          link_ = builderForValue.build();
          onChanged();
        } else {
          linkBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public Builder mergeLink(org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto value) {
        if (linkBuilder_ == null) {
          if (link_ != null) {
            link_ =
              org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.newBuilder(link_).mergeFrom(value).buildPartial();
          } else {
            link_ = value;
          }
          onChanged();
        } else {
          linkBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public Builder clearLink() {
        if (linkBuilder_ == null) {
          link_ = null;
          onChanged();
        } else {
          link_ = null;
          linkBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.Builder getLinkBuilder() {
        
        onChanged();
        return getLinkFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      public org.onosproject.grpc.models.LinkProtoOuterClass.LinkProtoOrBuilder getLinkOrBuilder() {
        if (linkBuilder_ != null) {
          return linkBuilder_.getMessageOrBuilder();
        } else {
          return link_ == null ?
              org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.getDefaultInstance() : link_;
        }
      }
      /**
       * <code>.proto.LinkProto link = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto, org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.Builder, org.onosproject.grpc.models.LinkProtoOuterClass.LinkProtoOrBuilder> 
          getLinkFieldBuilder() {
        if (linkBuilder_ == null) {
          linkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto, org.onosproject.grpc.models.LinkProtoOuterClass.LinkProto.Builder, org.onosproject.grpc.models.LinkProtoOuterClass.LinkProtoOrBuilder>(
                  getLink(),
                  getParentForChildren(),
                  isClean());
          link_ = null;
        }
        return linkBuilder_;
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


      // @@protoc_insertion_point(builder_scope:proto.TopologyEdgeProto)
    }

    // @@protoc_insertion_point(class_scope:proto.TopologyEdgeProto)
    private static final org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto();
    }

    public static org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TopologyEdgeProto>
        PARSER = new com.google.protobuf.AbstractParser<TopologyEdgeProto>() {
      @java.lang.Override
      public TopologyEdgeProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TopologyEdgeProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TopologyEdgeProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TopologyEdgeProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.TopologyEdgeProtoOuterClass.TopologyEdgeProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_TopologyEdgeProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_TopologyEdgeProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027TopologyEdgeProto.proto\022\005proto\032\017LinkPr" +
      "oto.proto\"3\n\021TopologyEdgeProto\022\036\n\004link\030\001" +
      " \001(\0132\020.proto.LinkProtoB\035\n\033org.onosprojec" +
      "t.grpc.modelsb\006proto3"
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
          org.onosproject.grpc.models.LinkProtoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_proto_TopologyEdgeProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_TopologyEdgeProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_TopologyEdgeProto_descriptor,
        new java.lang.String[] { "Link", });
    org.onosproject.grpc.models.LinkProtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
