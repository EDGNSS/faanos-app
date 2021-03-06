// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrafficSelectorProto.proto

package org.onosproject.grpc.models;

public final class TrafficSelectorProtoOuterClass {
  private TrafficSelectorProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrafficSelectorProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.TrafficSelectorProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    java.util.List<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto> 
        getCriterionList();
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto getCriterion(int index);
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    int getCriterionCount();
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    java.util.List<? extends org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder> 
        getCriterionOrBuilderList();
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder getCriterionOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Corresponds to org.onosproject.net.flow.TrafficSelector.
   * </pre>
   *
   * Protobuf type {@code proto.TrafficSelectorProto}
   */
  public  static final class TrafficSelectorProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.TrafficSelectorProto)
      TrafficSelectorProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrafficSelectorProto.newBuilder() to construct.
    private TrafficSelectorProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrafficSelectorProto() {
      criterion_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TrafficSelectorProto(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                criterion_ = new java.util.ArrayList<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              criterion_.add(
                  input.readMessage(org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          criterion_ = java.util.Collections.unmodifiableList(criterion_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.internal_static_proto_TrafficSelectorProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.internal_static_proto_TrafficSelectorProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.class, org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.Builder.class);
    }

    public static final int CRITERION_FIELD_NUMBER = 1;
    private java.util.List<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto> criterion_;
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    public java.util.List<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto> getCriterionList() {
      return criterion_;
    }
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    public java.util.List<? extends org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder> 
        getCriterionOrBuilderList() {
      return criterion_;
    }
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    public int getCriterionCount() {
      return criterion_.size();
    }
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto getCriterion(int index) {
      return criterion_.get(index);
    }
    /**
     * <code>repeated .proto.CriterionProto criterion = 1;</code>
     */
    public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder getCriterionOrBuilder(
        int index) {
      return criterion_.get(index);
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
      for (int i = 0; i < criterion_.size(); i++) {
        output.writeMessage(1, criterion_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < criterion_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, criterion_.get(i));
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
      if (!(obj instanceof org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto)) {
        return super.equals(obj);
      }
      org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto other = (org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto) obj;

      boolean result = true;
      result = result && getCriterionList()
          .equals(other.getCriterionList());
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
      if (getCriterionCount() > 0) {
        hash = (37 * hash) + CRITERION_FIELD_NUMBER;
        hash = (53 * hash) + getCriterionList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parseFrom(
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
    public static Builder newBuilder(org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto prototype) {
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
     * Corresponds to org.onosproject.net.flow.TrafficSelector.
     * </pre>
     *
     * Protobuf type {@code proto.TrafficSelectorProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.TrafficSelectorProto)
        org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.internal_static_proto_TrafficSelectorProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.internal_static_proto_TrafficSelectorProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.class, org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.Builder.class);
      }

      // Construct using org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.newBuilder()
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
          getCriterionFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (criterionBuilder_ == null) {
          criterion_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          criterionBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.internal_static_proto_TrafficSelectorProto_descriptor;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto getDefaultInstanceForType() {
        return org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto build() {
        org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto buildPartial() {
        org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto result = new org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto(this);
        int from_bitField0_ = bitField0_;
        if (criterionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            criterion_ = java.util.Collections.unmodifiableList(criterion_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.criterion_ = criterion_;
        } else {
          result.criterion_ = criterionBuilder_.build();
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
        if (other instanceof org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto) {
          return mergeFrom((org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto other) {
        if (other == org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto.getDefaultInstance()) return this;
        if (criterionBuilder_ == null) {
          if (!other.criterion_.isEmpty()) {
            if (criterion_.isEmpty()) {
              criterion_ = other.criterion_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCriterionIsMutable();
              criterion_.addAll(other.criterion_);
            }
            onChanged();
          }
        } else {
          if (!other.criterion_.isEmpty()) {
            if (criterionBuilder_.isEmpty()) {
              criterionBuilder_.dispose();
              criterionBuilder_ = null;
              criterion_ = other.criterion_;
              bitField0_ = (bitField0_ & ~0x00000001);
              criterionBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCriterionFieldBuilder() : null;
            } else {
              criterionBuilder_.addAllMessages(other.criterion_);
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
        org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto> criterion_ =
        java.util.Collections.emptyList();
      private void ensureCriterionIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          criterion_ = new java.util.ArrayList<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto>(criterion_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder> criterionBuilder_;

      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public java.util.List<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto> getCriterionList() {
        if (criterionBuilder_ == null) {
          return java.util.Collections.unmodifiableList(criterion_);
        } else {
          return criterionBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public int getCriterionCount() {
        if (criterionBuilder_ == null) {
          return criterion_.size();
        } else {
          return criterionBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto getCriterion(int index) {
        if (criterionBuilder_ == null) {
          return criterion_.get(index);
        } else {
          return criterionBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder setCriterion(
          int index, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto value) {
        if (criterionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCriterionIsMutable();
          criterion_.set(index, value);
          onChanged();
        } else {
          criterionBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder setCriterion(
          int index, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder builderForValue) {
        if (criterionBuilder_ == null) {
          ensureCriterionIsMutable();
          criterion_.set(index, builderForValue.build());
          onChanged();
        } else {
          criterionBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder addCriterion(org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto value) {
        if (criterionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCriterionIsMutable();
          criterion_.add(value);
          onChanged();
        } else {
          criterionBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder addCriterion(
          int index, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto value) {
        if (criterionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCriterionIsMutable();
          criterion_.add(index, value);
          onChanged();
        } else {
          criterionBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder addCriterion(
          org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder builderForValue) {
        if (criterionBuilder_ == null) {
          ensureCriterionIsMutable();
          criterion_.add(builderForValue.build());
          onChanged();
        } else {
          criterionBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder addCriterion(
          int index, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder builderForValue) {
        if (criterionBuilder_ == null) {
          ensureCriterionIsMutable();
          criterion_.add(index, builderForValue.build());
          onChanged();
        } else {
          criterionBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder addAllCriterion(
          java.lang.Iterable<? extends org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto> values) {
        if (criterionBuilder_ == null) {
          ensureCriterionIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, criterion_);
          onChanged();
        } else {
          criterionBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder clearCriterion() {
        if (criterionBuilder_ == null) {
          criterion_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          criterionBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public Builder removeCriterion(int index) {
        if (criterionBuilder_ == null) {
          ensureCriterionIsMutable();
          criterion_.remove(index);
          onChanged();
        } else {
          criterionBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder getCriterionBuilder(
          int index) {
        return getCriterionFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder getCriterionOrBuilder(
          int index) {
        if (criterionBuilder_ == null) {
          return criterion_.get(index);  } else {
          return criterionBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public java.util.List<? extends org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder> 
           getCriterionOrBuilderList() {
        if (criterionBuilder_ != null) {
          return criterionBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(criterion_);
        }
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder addCriterionBuilder() {
        return getCriterionFieldBuilder().addBuilder(
            org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.getDefaultInstance());
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder addCriterionBuilder(
          int index) {
        return getCriterionFieldBuilder().addBuilder(
            index, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.getDefaultInstance());
      }
      /**
       * <code>repeated .proto.CriterionProto criterion = 1;</code>
       */
      public java.util.List<org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder> 
           getCriterionBuilderList() {
        return getCriterionFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder> 
          getCriterionFieldBuilder() {
        if (criterionBuilder_ == null) {
          criterionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProto.Builder, org.onosproject.grpc.models.CriterionProtoOuterClass.CriterionProtoOrBuilder>(
                  criterion_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          criterion_ = null;
        }
        return criterionBuilder_;
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


      // @@protoc_insertion_point(builder_scope:proto.TrafficSelectorProto)
    }

    // @@protoc_insertion_point(class_scope:proto.TrafficSelectorProto)
    private static final org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto();
    }

    public static org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrafficSelectorProto>
        PARSER = new com.google.protobuf.AbstractParser<TrafficSelectorProto>() {
      @java.lang.Override
      public TrafficSelectorProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrafficSelectorProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TrafficSelectorProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrafficSelectorProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_TrafficSelectorProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_TrafficSelectorProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TrafficSelectorProto.proto\022\005proto\032\024Cri" +
      "terionProto.proto\"@\n\024TrafficSelectorProt" +
      "o\022(\n\tcriterion\030\001 \003(\0132\025.proto.CriterionPr" +
      "otoB\035\n\033org.onosproject.grpc.modelsb\006prot" +
      "o3"
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
          org.onosproject.grpc.models.CriterionProtoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_proto_TrafficSelectorProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_TrafficSelectorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_TrafficSelectorProto_descriptor,
        new java.lang.String[] { "Criterion", });
    org.onosproject.grpc.models.CriterionProtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
