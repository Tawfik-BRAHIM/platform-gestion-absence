import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SupabsComponent } from './supabs.component';

describe('SupabsComponent', () => {
  let component: SupabsComponent;
  let fixture: ComponentFixture<SupabsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SupabsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SupabsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
