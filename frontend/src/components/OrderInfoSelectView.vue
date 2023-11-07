<template>

    <v-data-table
        :headers="headers"
        :items="orderInfoSelect"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderInfoSelectView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderInfoSelect : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderInfoSelects'))

            temp.data._embedded.orderInfoSelects.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderInfoSelect = temp.data._embedded.orderInfoSelects;
        },
        methods: {
        }
    }
</script>

