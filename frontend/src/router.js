
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderMgmtManager from "./components/listers/OrderOrderMgmtCards"
import OrderOrderMgmtDetail from "./components/listers/OrderOrderMgmtDetail"

import DeliveryDeliveryMgmtManager from "./components/listers/DeliveryDeliveryMgmtCards"
import DeliveryDeliveryMgmtDetail from "./components/listers/DeliveryDeliveryMgmtDetail"

import ProductInventoryMgmtManager from "./components/listers/ProductInventoryMgmtCards"
import ProductInventoryMgmtDetail from "./components/listers/ProductInventoryMgmtDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orderMgmts',
                name: 'OrderOrderMgmtManager',
                component: OrderOrderMgmtManager
            },
            {
                path: '/orders/orderMgmts/:id',
                name: 'OrderOrderMgmtDetail',
                component: OrderOrderMgmtDetail
            },

            {
                path: '/deliveries/deliveryMgmts',
                name: 'DeliveryDeliveryMgmtManager',
                component: DeliveryDeliveryMgmtManager
            },
            {
                path: '/deliveries/deliveryMgmts/:id',
                name: 'DeliveryDeliveryMgmtDetail',
                component: DeliveryDeliveryMgmtDetail
            },

            {
                path: '/products/inventoryMgmts',
                name: 'ProductInventoryMgmtManager',
                component: ProductInventoryMgmtManager
            },
            {
                path: '/products/inventoryMgmts/:id',
                name: 'ProductInventoryMgmtDetail',
                component: ProductInventoryMgmtDetail
            },




    ]
})
