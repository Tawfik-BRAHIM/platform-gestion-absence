import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccAdminComponent } from './acc-admin.component';

describe('AccAdminComponent', () => {
  let component: AccAdminComponent;
  let fixture: ComponentFixture<AccAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccAdminComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AccAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
