import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AffichabsComponent } from './affichabs.component';

describe('AffichabsComponent', () => {
  let component: AffichabsComponent;
  let fixture: ComponentFixture<AffichabsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AffichabsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AffichabsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
