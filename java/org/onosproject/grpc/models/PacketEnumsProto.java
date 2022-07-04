// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacketEnumsProto.proto

package org.onosproject.grpc.models;

public final class PacketEnumsProto {
  private PacketEnumsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code proto.PacketEventTypeProto}
   */
  public enum PacketEventTypeProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EMIT = 0;</code>
     */
    EMIT(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EMIT = 0;</code>
     */
    public static final int EMIT_VALUE = 0;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PacketEventTypeProto valueOf(int value) {
      return forNumber(value);
    }

    public static PacketEventTypeProto forNumber(int value) {
      switch (value) {
        case 0: return EMIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PacketEventTypeProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PacketEventTypeProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PacketEventTypeProto>() {
            public PacketEventTypeProto findValueByNumber(int number) {
              return PacketEventTypeProto.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.onosproject.grpc.models.PacketEnumsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final PacketEventTypeProto[] VALUES = values();

    public static PacketEventTypeProto valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PacketEventTypeProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.PacketEventTypeProto)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PacketEnumsProto.proto\022\005proto* \n\024Packe" +
      "tEventTypeProto\022\010\n\004EMIT\020\000B\035\n\033org.onospro" +
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
