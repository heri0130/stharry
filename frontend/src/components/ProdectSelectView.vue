<template>

    <v-data-table
        :headers="headers"
        :items="prodectSelect"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ProdectSelectView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            prodectSelect : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/prodectSelects'))

            temp.data._embedded.prodectSelects.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.prodectSelect = temp.data._embedded.prodectSelects;
        },
        methods: {
        }
    }
</script>

