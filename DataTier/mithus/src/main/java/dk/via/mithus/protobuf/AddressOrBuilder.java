// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package dk.via.mithus.protobuf;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.mithus.protobuf.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string street = 2;</code>
   * @return The street.
   */
  java.lang.String getStreet();
  /**
   * <code>string street = 2;</code>
   * @return The bytes for street.
   */
  com.google.protobuf.ByteString
      getStreetBytes();

  /**
   * <code>string city = 3;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 3;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string country = 4;</code>
   * @return The country.
   */
  java.lang.String getCountry();
  /**
   * <code>string country = 4;</code>
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <code>string zipCode = 5;</code>
   * @return The zipCode.
   */
  java.lang.String getZipCode();
  /**
   * <code>string zipCode = 5;</code>
   * @return The bytes for zipCode.
   */
  com.google.protobuf.ByteString
      getZipCodeBytes();
}
