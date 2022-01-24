package com.amazonaws.encryptionsdk.kmsv2;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kms.KmsClient;

@FunctionalInterface
public interface RegionalClientSupplier {
  /**
   * Supplies an {@link KmsClient} instance to use for a given {@link Region}. The {@link KmsMasterKeyProvider} will
   * not cache the result of this function.
   *
   * @param region The region to get a client for
   * @return The client to use, or null if this region cannot or should not be used.
   */
  KmsClient getClient(Region region);
}
