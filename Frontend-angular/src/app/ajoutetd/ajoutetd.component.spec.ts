import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutetdComponent } from './ajoutetd.component';

describe('AjoutetdComponent', () => {
  let component: AjoutetdComponent;
  let fixture: ComponentFixture<AjoutetdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutetdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AjoutetdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
