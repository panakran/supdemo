export interface ISupplier {
    id?: number;
    companyName?: string;
    firstName?: string;
    lastName?: string;
    vatNumber?: number;
    irsOffice?: string;
    address?: string;
    zipCode?: number;
    city?: string;
    country?: string;
}

export class Supplier implements ISupplier {
    constructor(
        public id?: number,
        public companyName?: string,
        public firstName?: string,
        public lastName?: string,
        public vatNumber?: number,
        public irsOffice?: string,
        public address?: string,
        public zipCode?: number,
        public city?: string,
        public country?: string
    ) {}
}
