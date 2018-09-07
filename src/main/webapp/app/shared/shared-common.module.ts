import { NgModule } from '@angular/core';

import { JhipdemoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [JhipdemoSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [JhipdemoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class JhipdemoSharedCommonModule {}
