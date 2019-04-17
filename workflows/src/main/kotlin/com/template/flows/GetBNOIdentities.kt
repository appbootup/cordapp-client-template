package com.template.flows

import co.paralleluniverse.fibers.Suspendable
import com.r3.businessnetworks.membership.flows.member.service.MemberConfigurationService
import net.corda.core.flows.*
import net.corda.core.identity.Party


/**
 * This is a way of fetching the BNO identities from the membership-service.conf
 */
@InitiatingFlow
@StartableByRPC
class getBNOIdentities() : FlowLogic<List<Party>>() {

    companion object {

    }

    @Suspendable
    override fun call(): List<Party> {
        return MemberConfigurationService(serviceHub).bnoIdentities().toList()
    }
}