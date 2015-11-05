## Mongo Java Driver for Android

This is a fork of the offficial mongo driver that adds support for Android by adding in the missing Sasl classes required for authentication. Those classes are in the full Java SE framework but do not exist on Android. The classes are added from the repository located at https://github.com/koterpillar/android-sasl

## Building

Use the branch `android-sasl-build`. This is branched from the latest (at the time of this writing) release tag, 3.1.0. 

## Notes

Call MongoAndroid.init() before use. This in turn will call `java.security.Security.addProvider(new gnu.javax.crypto.jce.GnuSasl())` required for use of the GNU sasl classes.

