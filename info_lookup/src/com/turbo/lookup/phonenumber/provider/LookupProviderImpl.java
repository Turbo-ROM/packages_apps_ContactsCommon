package com.turbo.lookup.phonenumber.provider;

import android.content.Context;
import android.os.Handler;
import com.turbo.lookup.phonenumber.contract.LookupProvider;
import com.turbo.lookup.phonenumber.request.LookupRequest;

/**
 * Shell implementation of a phonenumber LookupProvider
 */
public class LookupProviderImpl implements LookupProvider {

    public LookupProviderImpl(Context context) {
        /* NOT IMPLEMENTED */
    }

    @Override
    public boolean initialize() {
        /* NOT a valid implementation */
        return false;
    }

    @Override
    public void fetchInfo(final LookupRequest request) {
        /* NOT IMPLEMENTED */
    }

    @Override
    public void disable() {
        /* NOT IMPLEMENTED */
    }

    @Override
    public boolean isEnabled() {
        /* NOT a valid implementation */
        return false;
    }

    @Override
    public void markAsSpam(String phoneNumber) {
        /* NOT IMPLEMENTED */
    }

    @Override
    public void unmarkAsSpam(String phoneNumber) {
        /* NOT IMPLEMENTED */
    }

    @Override
    public boolean supportsSpamReporting() {
        /* NOT a valid implementation */
        return false;
    }

    @Override
    public String getDisplayName() {
        /* NOT a valid implementation */
        return null;
    }

}
