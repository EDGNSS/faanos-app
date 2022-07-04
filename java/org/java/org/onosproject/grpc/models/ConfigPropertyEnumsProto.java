// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfigPropertyEnumsProto.proto

package org.onosproject.grpc.models;

public final class ConfigPropertyEnumsProto {
  private ConfigPropertyEnumsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code proto.ConfigPropertyTypeProto}
   */
  public enum ConfigPropertyTypeProto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STRING = 0;</code>
     */
    STRING(0),
    /**
     * <code>BYTE = 1;</code>
     */
    BYTE(1),
    /**
     * <code>INTEGER = 2;</code>
     */
    INTEGER(2),
    /**
     * <code>LONG_CONFIG = 3;</code>
     */
    LONG_CONFIG(3),
    /**
     * <code>FLOAT = 4;</code>
     */
    FLOAT(4),
    /**
     * <code>DOUBLE = 5;</code>
     */
    DOUBLE(5),
    /**
     * <code>BOOLEAN = 6;</code>
     */
    BOOLEAN(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STRING = 0;</code>
     */
    public static final int STRING_VALUE = 0;
    /**
     * <code>BYTE = 1;</code>
     */
    public static final int BYTE_VALUE = 1;
    /**
     * <code>INTEGER = 2;</code>
     */
    public static final int INTEGER_VALUE = 2;
    /**
     * <code>LONG_CONFIG = 3;</code>
     */
    public static final int LONG_CONFIG_VALUE = 3;
    /**
     * <code>FLOAT = 4;</code>
     */
    public static final int FLOAT_VALUE = 4;
    /**
     * <code>DOUBLE = 5;</code>
     */
    public static final int DOUBLE_VALUE = 5;
    /**
     * <code>BOOLEAN = 6;</code>
     */
    public static final int BOOLEAN_VALUE = 6;


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
    public static ConfigPropertyTypeProto valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigPropertyTypeProto forNumber(int value) {
      switch (value) {
        case 0: return STRING;
        case 1: return BYTE;
        case 2: return INTEGER;
        case 3: return LONG_CONFIG;
        case 4: return FLOAT;
        case 5: return DOUBLE;
        case 6: return BOOLEAN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConfigPropertyTypeProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConfigPropertyTypeProto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConfigPropertyTypeProto>() {
            public ConfigPropertyTypeProto findValueByNumber(int number) {
              return ConfigPropertyTypeProto.forNumber(number);
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
      return org.onosproject.grpc.models.ConfigPropertyEnumsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConfigPropertyTypeProto[] VALUES = values();

    public static ConfigPropertyTypeProto valueOf(
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

    private ConfigPropertyTypeProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.ConfigPropertyTypeProto)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036ConfigPropertyEnumsProto.proto\022\005proto*" +
      "q\n\027ConfigPropertyTypeProto\022\n\n\006STRING\020\000\022\010" +
      "\n\004BYTE\020\001\022\013\n\007INTEGER\020\002\022\017\n\013LONG_CONFIG\020\003\022\t" +
      "\n\005FLOAT\020\004\022\n\n\006DOUBLE\020\005\022\013\n\007BOOLEAN\020\006B\035\n\033or" +
      "g.onosproject.grpc.modelsb\006proto3"
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